package cz.vutbr.feec.bmds.cv1.test;

import cz.vutbr.feec.bmds.cv1.ListClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ListClassTest {
    ListClass tester;

    @BeforeEach
    void setUp() {
        tester = new ListClass();
    }

    @Test
    void store() {
        int insertValue = 11;
        tester.store(insertValue);
        assertEquals(insertValue, tester.sum());
    }

    @Test
    void getFirst() {
        Throwable exception = assertThrows(IOException.class, () -> tester.getFirst());
        assertEquals("List is empty", exception.getMessage());

        int first = 111111;
        int result = -1;
        Random rand = new Random();

        tester.store(first);
        int forStartAt = rand.nextInt() % 50;
        while (forStartAt < 10) {
            forStartAt = rand.nextInt() % 50;
        }
        for (int i = 0; i < forStartAt; i++) {
            int insertVal = rand.nextInt();
            if (insertVal != first)
                tester.store(insertVal);
        }
        try {
            result = tester.getFirst();
        } catch (IOException e) {
            fail("List is empty, it shouldn't be empty!");
        }
        assertEquals(first, result);
    }

    @Test
    void getLast() {
        Throwable exception = assertThrows(IOException.class, () -> tester.getLast());
        assertEquals("List is empty", exception.getMessage());

        int last = 111111;
        int result = -1;
        Random rand = new Random();

        int forStartAt = rand.nextInt() % 50;
        while (forStartAt < 10) {
            forStartAt = rand.nextInt() % 50;
        }
        for (int i = 0; i < forStartAt; i++) {
            int insertVal = rand.nextInt();
            if (insertVal != last)
                tester.store(insertVal);
        }
        tester.store(last);
        try {
            result = tester.getLast();
        } catch (IOException e) {
            fail("List is empty, it shouldn't be empty!");
        }
        assertEquals(last, result);
    }

    @Test
    void sum() {
        Random rand = new Random();
        int sum = 0;
        int length = rand.nextInt(Integer.SIZE - 1) % 50;
        int generated;

        for (int i = 0; i < length; i++) {
            generated = rand.nextInt(9999);
            tester.store(generated);
            sum += generated;
        }
        assertEquals(sum, tester.sum());
    }
}
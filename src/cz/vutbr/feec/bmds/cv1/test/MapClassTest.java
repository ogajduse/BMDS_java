package cz.vutbr.feec.bmds.cv1.test;

import cz.vutbr.feec.bmds.cv1.MapClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapClassTest {
    MapClass tester;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        tester = new MapClass();
    }

    @AfterEach
    void tearDown() {
        System.setOut(null);
    }

    @Test
    void testPrint() {
        String expected = "one->1\n" +
                "two->2\n" +
                "three->3\n";
        tester.store("one", "1");
        tester.store("two", "2");
        tester.store("three", "3");
        tester.print();
        assertEquals(expected, outContent.toString());
    }
}
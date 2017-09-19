package cz.vutbr.feec.utko.bmds.cv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyClass {
    static double total(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }

    static double division(double a, double b) {
        System.out.println(a / b);
        if (b == 0) {
            throw new ArithmeticException("Can't do division by zero!");
        }
        return a / b;
    }

    static void listOut(ArrayList<Integer> list) {
        for (int a : list) System.out.println(a);
    }

    static int listMultiply(ArrayList<Integer> list) {
        int sum = 1;
        for (int a : list) sum *= a;
        System.out.println("ArrayList sum: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        total(10, 1);
        try {
            division(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 10; i > 0; i--) arrayList.add(i);
        listOut(arrayList);
        Collections.sort(arrayList);
        listOut(arrayList);
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(4, "Hello world!");
        if (hm.containsKey(4)) {
            System.out.println("Contains key!");
        } else {
            System.out.println("Does not contain key!");
        }
        if (hm.containsValue("Hello world!")) {
            System.out.println("Contains value!");
        } else {
            System.out.println("Does not contain value!");
        }
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        for (Map.Entry<Integer, String> entry : hm.entrySet())
            System.out.println(entry.getKey() + "->" + entry.getValue());
    }
}

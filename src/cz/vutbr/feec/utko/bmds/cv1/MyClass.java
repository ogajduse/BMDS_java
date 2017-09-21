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

    static double division(double a, double b) throws ArithmeticException {
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
        return sum;
    }

    public static void main(String[] args) {
        total(10, 1);
        try {
            division(10, 0);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 10; i > 0; i--) arrayList.add(i);
        listOut(arrayList);
        Collections.sort(arrayList);
        listOut(arrayList);
        System.out.println("ArrayList sum: " + listMultiply(arrayList));
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        if (hm.containsKey(4)) {
            System.out.println("Contains key!");
        } else {
            System.out.println("Does not contain key!");
        }
        if (hm.containsValue("Two")) {
            System.out.println("Contains value!");
        } else {
            System.out.println("Does not contain value!");
        }
        System.out.println("Hash map size: " + hm.size());
        System.out.println("Keys: " + hm.keySet());
        System.out.println("Values: " + hm.values());
        int i = 0;
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            if (i % 2 != 1) System.out.println(entry.getKey() + "->" + entry.getValue());
            i++;
        }
    }
}

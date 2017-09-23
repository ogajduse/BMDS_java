package cz.vutbr.feec.bmds.cv1;

import java.util.Map;

public class MapClass {
    private Map<String, String> stringStringMap;

    public void store(String key, String value) {
        stringStringMap.put(key, value);
    }

    public void print() {
        for (Map.Entry<String, String> entry : stringStringMap.entrySet())
            System.out.println(entry.getKey() + "->" + entry.getValue());
    }
}

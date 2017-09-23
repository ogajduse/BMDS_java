package cz.vutbr.feec.bmds.cv1;

import java.io.IOException;
import java.util.List;

public class ListClass {
    private List<Integer> seznam;

    public void store(Integer num) {
        seznam.add(num);
    }

    public Integer getFirst() throws IOException {
        return seznam.get(0);
    }

    public Integer getLast() throws IOException {
        return seznam.get(seznam.size() - 1);
    }

    public int sum() {
        return seznam.stream().mapToInt(Integer::intValue).sum();
    }
}



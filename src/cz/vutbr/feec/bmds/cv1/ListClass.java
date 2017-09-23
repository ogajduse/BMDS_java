package cz.vutbr.feec.bmds.cv1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListClass {
    private List<Integer> list = new ArrayList<>();

    public void store(Integer num) {
        list.add(num);
    }

    public Integer getFirst() throws IOException {
        if (list.size() == 0)
            throw new IOException("List is empty");
        return list.get(0);

    }

    public Integer getLast() throws IOException {
        if (list.size() == 0)
            throw new IOException("List is empty");
        return list.get(list.size() - 1);
    }

    public int sum() {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}



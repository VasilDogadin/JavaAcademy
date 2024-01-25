package org.example.module2.homework2.ex3;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private Map<Detail, Integer> detailMap;

    public Item() {
        this.detailMap = new HashMap<>();
    }

    public void addDetail(Detail detail, int value) {
        detailMap.put(detail, value);
    }

    public void printDetails() {
        Detail lastDetail = detailMap.keySet().iterator().next();
        System.out.println(lastDetail.getName() + detailMap.get(lastDetail));
    }
}

package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {

    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                for (int j = 0; j < 2; j++) {
                    result.add(sourceList.get(i));
                }
            }
        }
        return result;
    }
}
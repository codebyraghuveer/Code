package com.codeinjava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindHighestLengthOfStrings {
    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Raghuveer", "Sravya","Prakash", "Raghuveer Reddy");

        stringList.stream()
                .collect(Collectors.toMap(name->name, String::length,(name1, name2)->name2, TreeMap::new))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);

    }
}

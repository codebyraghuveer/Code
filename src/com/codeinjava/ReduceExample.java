package com.codeinjava;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 6);
        Integer integerOptional = list.stream().reduce(0, Integer::sum);
        System.out.println(integerOptional);

    }
}

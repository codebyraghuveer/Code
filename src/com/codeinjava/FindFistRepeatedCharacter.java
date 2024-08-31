package com.codeinjava;

import java.util.stream.IntStream;

public class FindFistRepeatedCharacter {

    public static void main(String[] args) {

        String name= "KalluRaghuveerReddy";
        IntStream.range(0, name.length()-1)
                .filter(i -> name.charAt(i) == name.charAt(i+1))
                .mapToObj(i ->(char)i)
                .forEach(System.out::println);
    }
}

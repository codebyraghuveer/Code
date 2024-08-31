package com.codeinjava;

public class EliminateDuplicateCharacters {
    public static void main(String[] args) {
        String name="Narsi Reddy";
        name.chars().mapToObj(c->(char)c)
                .forEach(System.out::println);
    }
}

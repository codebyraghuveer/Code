package com.codeinjava;

public class LambdaExpression {
    public static void main(String[] args) {
        String name = "Raghu";

        InterfaceExample<String> predicate = (v) -> {
            return v.length() > 5;
        };
        System.out.println(predicate.test(name));
    }
}

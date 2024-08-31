package com.codeinjava;

@FunctionalInterface
public interface InterfaceExample<T> {

    boolean test(T t);

    default boolean test2(T t) {
        return true;
    }
}

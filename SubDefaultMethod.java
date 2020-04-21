package com.reddy;

@FunctionalInterface
public interface SubDefaultMethod {

    int sub();
    default int add(int abc){
        return abc + 10;
    }
}

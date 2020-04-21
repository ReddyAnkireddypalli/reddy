package com.reddy;

@FunctionalInterface
public interface AddDefaultMethod {

    int add();
    default int add(int abc){
        return abc + 10;
    }
}

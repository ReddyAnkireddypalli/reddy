package com.reddy;

import static java.lang.System.out;

public class DefaultMethodMain implements AddDefaultMethod, SubDefaultMethod {

    public static void main(String[] args){

        AddDefaultMethod abc = new DefaultMethodMain();
        abc.add();
        abc.add(10);

        SubDefaultMethod edf = new DefaultMethodMain();
        edf.sub();
        edf.add(20);
    }

    @Override
    public int add() {
        out.println("Add");
        return 0;
    }

    @Override
    public int add(int abc) {
        out.println("abc"+(abc+10));
        return 0;
    }

    @Override
    public int sub() {
        out.println("Sub");
        return 0;
    }
}

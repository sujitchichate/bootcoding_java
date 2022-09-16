package com.bootcoding.oops.interfaces;

public class Hero implements Cycle{

    @Override
    public void getType() {
        System.out.println("Hero Cycle");
    }

    @Override
    public int getGear() {
        System.out.println(1);
        return 0;
    }

    @Override
    public boolean getWithoutGear() {
        System.out.println("true");
        return false;
    }
}

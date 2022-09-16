package com.bootcoding.oops.interfaces;

public class Atlas implements Cycle{

    @Override
    public void getType() {
        System.out.println("Atlas Cycle");
    }

    @Override
    public int getGear() {
        System.out.println(2);
        return 0;
    }

    @Override
    public boolean getWithoutGear() {
        System.out.println("Cycle is withou Gear");
        return false;
    }
}

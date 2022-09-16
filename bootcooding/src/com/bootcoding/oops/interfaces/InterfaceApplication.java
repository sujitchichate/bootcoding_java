package com.bootcoding.oops.interfaces;

public class InterfaceApplication {
    public static void main(String[] args) {
        Hero object=new Hero();
        object.getGear();
        object.getType();
        object.getWithoutGear();

        Atlas a=new Atlas();
        a.getGear();
        a.getWithoutGear();
        a.getType();
    }
}

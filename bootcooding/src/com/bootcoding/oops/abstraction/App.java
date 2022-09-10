package com.bootcoding.oops.abstraction;

public class App {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sleep();
        d.sound();
        d.see();

        Goat g=new Goat();
        g.sleep();
        g.sound();
        g.see();

        Cat c=new Cat();
        c.sleep();
        c.sound();
        c.see();

        System.out.println(c.toString());
    }
}

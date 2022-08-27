package com.bootcoding.basic;

import java.sql.SQLOutput;

public class IgnoreCase {
    public static void main(String[] args) {
        String str="Raja";
        //(
        boolean b=str.equalsIgnoreCase("rAJA");// longcut method we do in two lines
        System.out.println(b);
        //)

        System.out.println(str.equalsIgnoreCase("raja"));// shortcut method converted two lines int one line
        System.out.println(str.equalsIgnoreCase("RAJA"));
        System.out.println(str.equalsIgnoreCase("Banti"));
    }
}

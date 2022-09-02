package com.bootcoding.basic;

public class Marker {
    String company;
    String color;
    String type;
    double price;

    public void fillMarker(){
        System.out.println("xyz");
    }
   public Marker(){
       System.out.println("Marker object created");

   }

    public static void main(String[] args) {
        Marker m1=new Marker();
        m1.company="Camlin";
        m1.color="Blue";
        m1.type="White Board";
        m1.price=127.00;
        Marker m2=new Marker();
        m2.company="Natraj";
        m2.color="Black";
        m2.type="White Board";
        m2.price=142.00;
        System.out.println(m1.company);
        System.out.println(m1.type);
        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println(m2.color);
        System.out.println(m2.company);
        System.out.println(m2.type);
        System.out.println(m2.price);
    }


}

package com.bootcoding.basic;

public class Canteen1 {
    public static void main(String[] args) {
        double order = cafe("Masala Dosa");
        System.out.println(order);
        double order2 = cafe ("Sambhar wada");
        System.out.println(order2);
        double order3 = cafe ("Idali");
        System.out.println(order3);
        double order4 = cafe ("Masala Dosa half plate");
        System.out.println("15");
    }

    static double cafe(String demand) {
        if (demand.equals("Masala Dosa")) {
            return 30.0;
        }
        else if (demand.equals("Sambhar wada")){
            return 20.0;
        }
        else if (demand.equals("Idali")){
            return 10.0;
        }
        else if (demand.equals("Masala Dosa half plate")){
            return 15.0;
        }
        return 0;
    }
}


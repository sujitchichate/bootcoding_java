package com.bootcoding.basic;

public class EducationAge {
    public static void main(String[] args) {
        int age=21;
        if (age<5){
            System.out.println("nursery");
        }
        else if (age>=5 && age<16){
            System.out.println("school_k10");
        }
        else if(age>=16 && age<=18){
            System.out.println("school_k12");
        }
        else if(age>=19 && age<=22){
            System.out.println("graduate");
        }
    }
}

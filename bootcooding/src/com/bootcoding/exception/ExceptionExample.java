package com.bootcoding.exception;

import java.util.Scanner;

public class ExceptionExample {
    public void testException(){
        //TODO: Task
        //Take a number (n) from user and divide 10 by n and
        //handle Exception class with printStackTrace() and find which Exception is throwing?

        do {
            try{
                Scanner sc=new Scanner(System.in);
                int i=Integer.parseInt(sc.next());
                System.out.println("Value of Input : "+ i);
                System.out.println(" I am in try");
                //code error possibilities
                break;
            } catch (Exception ex){
                //code after getting exception
                System.out.println("Only Integer number Supported!");
                ex.printStackTrace();
            }
        }
        while (true);
    }
    public static void main(String[] args){

    }
}

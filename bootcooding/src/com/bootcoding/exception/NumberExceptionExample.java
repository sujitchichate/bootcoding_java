package com.bootcoding.exception;

public class NumberExceptionExample {
    //without handling exception
//    public int convertToInteger(String n)
//    {
//        int m=Integer.parseInt(n);
//        return m;
//    }
//    public static void main(String[] args) {
//        NumberExceptionExample object=new NumberExceptionExample();
//        int i=object.convertToInteger("abc");
//        System.out.println(i);
//
//
//    }
    public int convertToInteger(String n) {
        try {
            int l=2/1;
            int m = Integer.parseInt(n);

            return m;
        } catch (NumberFormatException ex) {
            System.err.println("Please provide integer number ");
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("I will execute");
        }

        return 0;
    }

    public static void main(String[] args) {
        NumberExceptionExample object=new NumberExceptionExample();
        int i=object.convertToInteger("123");
        System.out.println(i);


    }
}

package com.bootcoding.basic;

public class Calculator {
    public static void main(String[] args) {
//        System.out.println("Add :"+Calculator(10, 20, "Add"));
//        System.out.println("Mul :"+Calculator(10, 20, "Mul"));
//        System.out.println("Sub :"+Calculator(10, 20, "Sub"));
//        System.out.println("Div :"+Calculator(10, 20, "Div"));
//        int add = Calculator(10, 20, "Add");
//        int mul = Calculator(10, 20, "Mul");
//        int sub = Calculator(10, 20, "Sub");
//        int div = Calculator(10, 20, "Divi");

//        System.out.println(add);
//        System.out.println(mul);
//        System.out.println(sub);
//        System.out.println(div);
    }

    int Calculator(int n, int m, String action) {
        if (action == "Add") {
            return n + m;
        } else if (action == "Mul") {
            return n * m;
        } else if (action == "Sub") {
            return n - m;
        } else if (action == "Div") {
            return n / m;
        }else
        return n;
    }

}

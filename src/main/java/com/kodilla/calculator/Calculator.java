package com.kodilla.calculator;

public class Calculator {

    int a;
    int b;

    public Calculator( int a, int b){
        this.a = a;
        this.b = b;
    }
    public int addition () {
        System.out.println("It Works!!");
        return a + b;
    }
    public int substraction () {
        System.out.println("It also works!!");
        return a - b;
    }

    public static void main(String args[]) {
       Calculator calculator = new Calculator(10, 5);
       calculator.addition();
       calculator.substraction();
    }
}

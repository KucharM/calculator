package com.kodilla;

public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(5, 6);
        calculator.subtract(22, 4);
    }

    public void add(int x, int y) {
        int result = x + y;
        System.out.println("Result of adding: " + x + ", and " + y + ", is " + result);
    }

    public void subtract(int x, int y) {
        int result = x - y;
        System.out.println("Result of subtraction: " + x + ", and " + y + ", is " + result);
    }
}

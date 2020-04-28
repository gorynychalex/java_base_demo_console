package ru.popovich.demo01;

public class Main {
    public static void main(String[] args) {

	    int a = 3, b = 4;

	    System.out.println("Hello world");

	    Second second = new Second();

	    System.out.println(second.toString());

	    Calculator calculator = new Calculator();

	    System.out.println("Sum " + a + " + " + b + " = " + calculator.add(a,b));
    }
}

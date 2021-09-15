package com.simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    public SimpleCalculator() {}

    public SimpleCalculator(String operation, double numOne, double numTwo) {
        String welcomeMessage = "Performing calculation...";
        System.out.println(welcomeMessage);

        switch (operation) {
            case "ADD" -> this.add(numOne, numTwo);
            case "SUBTRACT" -> this.subtract(numOne, numTwo);
            case "MULTIPLY" -> this.multiply(numOne, numTwo);
            case "DIVIDE" -> this.divide(numOne, numTwo);
            default -> System.out.println("Invalid operation!");
        }
    }


    public double add(double numOne, double numTwo) {
        double sum = numOne + numTwo;
        this.printToScreen("+", numOne, numTwo, sum);
        return sum;
    }

    public double subtract(double numOne, double numTwo) {
        double difference = numOne - numTwo;
        this.printToScreen("-", numOne, numTwo, difference);
        return difference;
    }

    public double divide(double numOne, double numTwo) {
        double difference = numOne / numTwo;
        this.printToScreen("/", numOne, numTwo, difference);
        return difference;
    }

    public double multiply(double numOne, double numTwo) {
        double product = numOne * numTwo;
        this.printToScreen("*", numOne, numTwo, product);
        return product;
    }

    private void printToScreen(String operator, double numOne, double numTwo, double result) {
        System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double numOne = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double numTwo = scanner.nextDouble();

        System.out.println("Please one of the following operations to perform:");
        for (Operation operation : Operation.values()) {
            System.out.println(operation);
        }
        String operation = scanner.next();

        SimpleCalculator calculator = new SimpleCalculator(operation, numOne, numTwo);
    }
}


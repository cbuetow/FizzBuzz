package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // get input from user between 1-100
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber < 1 || inputNumber > 100) {
            System.out.println("Please enter a valid number");
        }

        if (inputNumber % 15 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (inputNumber % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (inputNumber % 3 == 0) {
            System.out.println("Fizz");
        }
        else System.out.println(inputNumber);
    }
}

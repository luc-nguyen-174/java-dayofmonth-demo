package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();

        String daysInMonth = switch (month) {
            case 2 -> "28 or 29";
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            default -> "";
        };
        if (!daysInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        } else
            System.out.print("Invalid input!");
    }
}
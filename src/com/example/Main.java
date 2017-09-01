package com.example;
import com.example.common.Month;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.asList(Month.values()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a month!");
        String a = scanner.nextLine().toUpperCase();
        Month b = Month.valueOf(a);

        List<String> enums = new ArrayList<>();
        switch (b) {
            case JANUARY:
                enums.add("January");
            case FEBRUARY:
                enums.add("February");
            case MARCH:
                enums.add("March");
            case APRIL:
                enums.add("April");
            case MAY:
                enums.add("May");
            case JUNE:
                enums.add("June");
            case JULY:
                enums.add("July");
            case AUGUST:
                enums.add("August");
            case SEPTEMBER:
                enums.add("September");
            case OCTOBER:
                enums.add("October");
            case NOVEMBER:
                enums.add("November");
            case DECEMBER:
                enums.add("December");
                break;
                default: break;
        }
//        if (enums.isEmpty()) {
//            System.out.println("Error");
//        } else {
            System.out.println("Your month was: " + b + ". Here is " + b + " and the following months: " + enums);

//
    }
}

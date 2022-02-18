package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter values of a, b and c :");
        int a = inputScanner.nextInt();  //taking input value for a
        int b = inputScanner.nextInt();  //taking input value for b
        int c = inputScanner.nextInt();  //taking input value for c
        inputScanner.close();
        //Logic for 2 roots of a quadratic equation
        int delta = (b*b) - (4*a*c);
        int root1 = (int) (-b + Math.sqrt(delta))/2*a;
        int root2 = (int) (-b - Math.sqrt(delta))/2*a;

        System.out.println("The roots of the equation are : " +root1+" , " +root2); //printing two roots
    }
}

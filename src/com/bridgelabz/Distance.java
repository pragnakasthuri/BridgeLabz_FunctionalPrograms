package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner  inputScanner = new Scanner(System.in);

        System.out.println("Enter values of x and y: ");
        int x = inputScanner.nextInt();  //Taking input value for x
        int y = inputScanner.nextInt();  //Taking input value for y
        //formula for calculating Euclidean Distance
        int distance = (int)  Math.sqrt(Math.pow((x),2) + Math.pow((y),2));
        System.out.println("Euclidean Distance : " +distance);
        inputScanner.close();
    }
}

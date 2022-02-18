package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter value for t and ensure it is <=50 :");
        double t = inputScanner.nextDouble();  //taking input value for t as double
        System.out.println("Enter value for v and ensure that it is between 3 and 120:");
        double v = inputScanner.nextDouble();  //taking input value for v as double

        while(t > 50 || (v < 3 || v > 120)){    //checking for given number is valid
            if (t > 50) {
                System.out.println("Enter value for t and ensure that it is less than 50 :");
                t = inputScanner.nextDouble();
            }
            if (v < 3 || v > 120) {
                System.out.println("Enter value for v and ensure that it is between 3 and 120:");
                v = inputScanner.nextDouble();
            }
        }
        inputScanner.close();
        double w = (35.74 * 0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16); //formula for calculating effective Temperature
        System.out.println("Effective Temperature(Wind chill value) : "+w);

    }

}

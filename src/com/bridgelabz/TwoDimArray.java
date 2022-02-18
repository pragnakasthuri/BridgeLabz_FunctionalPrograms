package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] array = buildArray();
        printArray(array);
    }
    public static int[][] buildArray() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = inputScanner.nextInt();  //taking input from user for rows
        System.out.println("Enter number of columns: ");
        int columns = inputScanner.nextInt();  //taking input from user for columns

        int[][] array = new int[rows][columns];

        for(int i=0; i< array.length; i++) {
            for(int j=0; j< array.length; j++) {
                System.out.println("Enter array element: ");
                array[i][j] = inputScanner.nextInt();  //taking input from user
            }
        }
        inputScanner.close();
        return array;
    }
    public static void printArray(int mat[][])
    {
        PrintWriter w = new PrintWriter(System.out, true); //using print writer class
        for (int[] row : mat) {
            w.println();
            w.print(Arrays.toString(row));
            w.flush();
        }
        w.close();  //closing the PrintWriter object
    }
}

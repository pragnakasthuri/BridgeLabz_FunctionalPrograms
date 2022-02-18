package com.bridgelabz;

import java.util.Scanner;

public class SumOf3IntegerZero {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = inputScanner.nextInt();  //taking input from user
        int[] array = new int[num];
        for(int i=0; i<num; i++) {
            System.out.println("Enter "+(i == 0 ? "" : "next")+" number");
            array[i] = inputScanner.nextInt();
        }
        //Iterating the array for desired triplets
        boolean found = false;
        for (int i=0; i<num-2; i++)
        {
            for (int j=i+1; j<num-1; j++)
            {
                for (int k=j+1; k<num; k++)
                {
                    if (array[i]+array[j]+array[k] == 0)
                    {
                        System.out.print(array[i]+ " "+ array[j] + " "+array[k]); //prints the triplets
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        if (found == false) // if we didn't find triplet
            System.out.println(" No desired triplets exist ");
    }
}

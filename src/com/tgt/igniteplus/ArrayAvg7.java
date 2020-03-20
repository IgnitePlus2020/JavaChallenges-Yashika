package com.tgt.igniteplus;
import java.util.Scanner;
public class ArrayAvg7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        float avg;
        System.out.println("Enter no. of array elements");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            sum += a[i];
        avg = sum / n;
        System.out.println("Average of array elements=" + avg);
    }


}

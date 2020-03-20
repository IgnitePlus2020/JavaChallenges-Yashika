package com.tgt.igniteplus;
import java.util.Scanner;
public class PftSqr5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter any value");
        n = in.nextInt();
        double sr = Math.sqrt(n);
        if ((sr - Math.floor(sr)) == 0)
            System.out.println(n + " is a perfect square");
        else
            System.out.println(n + " is not a perfect square");
    }
}


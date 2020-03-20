package com.tgt.igniteplus;
import java.util.Scanner;
public class UpperString11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("String in uppercase: "+str.toUpperCase());
    }
}

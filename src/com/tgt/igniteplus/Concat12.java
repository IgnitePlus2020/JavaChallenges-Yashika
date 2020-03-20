package com.tgt.igniteplus;
import java.util.Scanner;
public class Concat12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String1");
        String str1 = in.nextLine();
        System.out.println("Enter String2");
        String str2 = in.nextLine();
        System.out.println("Concatenated string: " + str1.concat(str2));
    }
}

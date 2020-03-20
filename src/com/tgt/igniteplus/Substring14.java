package com.tgt.igniteplus;
import java.util.Scanner;
public class Substring14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.next();
        System.out.println("enter the substring to be checked");
        String substr = in.next();
        if (str.contains(substr))
            System.out.println(substr + " is a substring of " + str);
        else
            System.out.println(substr + " is not a substring of " + str);
    }
}


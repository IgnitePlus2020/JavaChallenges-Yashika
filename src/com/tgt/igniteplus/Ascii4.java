package com.tgt.igniteplus;
import java.util.Scanner;
public class Ascii4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char c;
        System.out.println("Enter a character");
        c = in.next().charAt(0);
        int asciival=c;
        System.out.println("ASCII value of " + c + " is: " + asciival);
    }

}

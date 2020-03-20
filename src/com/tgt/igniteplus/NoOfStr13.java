package com.tgt.igniteplus;
import java.util.Scanner;
public class NoOfStr13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int word = 1;
        System.out.println("Enter String");
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t')
                word++;
        }
        System.out.println("No. of words= " + word);
    }
}


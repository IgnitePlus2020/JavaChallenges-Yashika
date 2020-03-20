package com.tgt.igniteplus;
import java.util.Scanner;
public class Replace20 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String newstr = null;
        System.out.println("enter the string");
        String str=in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                newstr = str.replace('a', '$');
        }
        System.out.println("Replaced string: " + newstr);
    }
}

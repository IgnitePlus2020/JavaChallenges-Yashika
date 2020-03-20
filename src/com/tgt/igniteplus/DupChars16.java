package com.tgt.igniteplus;
import java.util.*;
public class DupChars16 {
    public static void main(String[] args){
        String str;
        System.out.print("enter the string");
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        char[] input=str.toCharArray();
        System.out.println("the duplicate characters are");
        for(int i=0;i<str.length();i++) {
            for (int j = i + 1; j < str.length(); j++){
                if (input[i] == input[j])
                    System.out.print(input[j]);
            }
        }
    }
}


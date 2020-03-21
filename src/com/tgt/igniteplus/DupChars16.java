package com.tgt.igniteplus;
import java.util.*;
public class DupChars16 {
    public static void main(String[] args){
        String str;
        int count;
        System.out.print("enter the string");
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        char[] in=str.toCharArray();
        System.out.println("the duplicate characters are");
        for(int i = 0; i <str.length; i++) {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) {  
                if(in[i] == string[j] && in[i] != ' ') {  
                    count++;  
                    in[j] = '0';  
                }  
            }  
 
            if(count > 1 && in[i] != '0')  
                System.out.println(in[i]);  
        }  
    }  
}  

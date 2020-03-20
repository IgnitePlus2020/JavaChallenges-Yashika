package com.tgt.igniteplus;
import java.util.*;
public class Large18 {
    public static void main(String[] args){
        int x,y,z;
        System.out.print("enter the 3 numbers");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        int big=x>y?(x>z?x:z):(y>z?y:z);
        System.out.print("the largest of the 3 numbers is "+big);
    }
}


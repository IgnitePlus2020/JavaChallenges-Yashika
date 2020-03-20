package com.tgt.igniteplus;
import java.util.Scanner;
public class Discount3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float cp, sp, dis, damt;
        System.out.println("Enter the actual selling price");
        sp = in.nextFloat();
        System.out.println("Enter the rate of discount");
        dis = in.nextFloat();
        damt=(dis * sp) / 100;
        cp=sp-damt;
        System.out.println("Discount amount="+damt+"$");
        System.out.println("Actual cost price after discount=" + cp+"$");
    }


}

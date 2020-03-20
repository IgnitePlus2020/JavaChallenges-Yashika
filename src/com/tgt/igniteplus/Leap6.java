package com.tgt.igniteplus;
import java.util.Scanner;
public class Leap6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int yr;
        boolean flag=false;
        System.out.println("Enter any year");
        yr = in.nextInt();
        if (yr % 4 == 0)
        {
            if (yr % 100 == 0)
            {
                if (yr % 400 == 0)
                    flag = true;
                else
                    flag = false;
            }
            else
                flag=true;

        }
        else
            flag=false;
        if(flag)
            System.out.println(yr + " is a leap year");
        else
        System.out.println(yr + " is not a leap year");
    }

}

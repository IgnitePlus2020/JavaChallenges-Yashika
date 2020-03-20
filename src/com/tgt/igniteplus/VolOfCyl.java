package com.tgt.igniteplus;
import java.util.*;
public class VolOfCyl {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float r,h,vol,pi= (float) 3.14;
        System.out.println("Enter the radius of the cylinder");
        r=in.nextFloat();
        System.out.println("Enter the height of the cylinder");
        h=in.nextFloat();
        vol=(pi*(r*r)*h);
        System.out.println("Volume of the cylinder = "+vol);

    }
}

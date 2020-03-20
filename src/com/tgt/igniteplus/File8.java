package com.tgt.igniteplus;
import java.io.*;
import java.util.Scanner;
public class File8 {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the file to be created");
        String file = in.nextLine();
        try {
            File f = new File(file);
            if (f.createNewFile())
                System.out.println("File has been created " + f.getName());
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}






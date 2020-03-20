package com.tgt.igniteplus;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime1 {
    public static void main(String args[])
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}





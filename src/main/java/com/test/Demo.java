package com.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo
{
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(12,15);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(localTime.format(f));
    }
}

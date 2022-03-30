package com.company;

import java.util.Scanner;

public class Time {
    Scanner input = new Scanner(System.in);
    private int hours;
    private int minutes;
    private int seconds;

    public int GetHours() { return hours; }
    public int GetMinutes() { return minutes; }
    public int GetSeconds() { return seconds; }

    public boolean SetHours(int value)
    {
        if (value >= 0 && value < 23) { hours = value; return true; }
        else { hours = 0; return false; }
    }
    public boolean SetMinutes(int value)
    {
        if (value >= 0 && value < 60) { minutes = value; return true; }
        else { minutes = 0; return false; }
    }
    public boolean SetSeconds(int value)
    {
        if (value >= 0 && value < 60) { seconds = value; return true; }
        else { seconds = 0; return false; }
    }
    public boolean Init(int h, int m, int s)
    {
        return SetHours(h) && SetMinutes(m) && SetSeconds(s);
    }
    public void Read()
    {
        int h, m, s;

        do
        {
            System.out.print("Hour: ");
            h = input.nextInt();
            System.out.print("Minute: ");
            m = input.nextInt();
            System.out.print("Second: ");
            s = input.nextInt();

        } while (!Init(h, m, s));
    }
    public void Display1()
    {
        if (hours == 1)
            System.out.print( hours +" hour ");
        else
            System.out.print(hours +" hours ");

        if (minutes == 1)
            System.out.print(minutes+" minute ");
        else
            System.out.print(minutes+" minutes ");

        if (seconds == 1)
            System.out.println(seconds+" second ");
        else
            System.out.println(seconds+" seconds ");

    }
    public void Display2()
    {
        if (hours < 12)
            System.out.print( hours+1 +" a.m ");
        else
        {
            int h = 1;
            for (int i = 12; i <= hours; i++)
            {
                if (i == hours)
                    System.out.print(h +" p.m ");
                h++;
            }

        }

        if (minutes == 1)
            System.out.print(minutes+" minute ");
        else
            System.out.print(minutes+" minutes ");

        if (seconds == 1)
            System.out.println(seconds+" second ");
        else
            System.out.println(seconds+" seconds ");

    }
}

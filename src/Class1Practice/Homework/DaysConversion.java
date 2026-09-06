package Class1Practice.Homework;

import java.time.Year;
import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Days:-");
        int TotalDays = sc.nextInt();
        int Years = TotalDays/365;
        System.out.println("Years:"+Years);
        int RemDays = TotalDays %365;
        System.out.println("Remaining Days:-"+RemDays);
        int Weeks = RemDays/7;
        System.out.println("Weeks:"+Weeks);
        int Days = RemDays%7;
        System.out.println("Days:-"+Days);


    }
}

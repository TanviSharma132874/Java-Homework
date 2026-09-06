package Class1Practice.Homework;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TemperatureCon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Celsius Temp:-");
//        float Celsius = sc.nextFloat();
//        float Fahrenheit = (Celsius*9/5)+32;
//        System.out.println("Fahrenheit Temperature is :-"+Fahrenheit);
        System.out.println("Enter Temperature in the Fahrenheit:");
        float Fahrenheit = sc.nextFloat();
        float Celsius = (Fahrenheit -32)*5/9;
        System.out.println("Celsius Temperature is :- "+Celsius);


    }
}

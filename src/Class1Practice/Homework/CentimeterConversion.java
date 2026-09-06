package Class1Practice.Homework;

import java.util.Scanner;

public class CentimeterConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Distance in Centimeter:-");
        float Centimeter = sc.nextFloat();
        float Meter = Centimeter/100;
        float Kilometer = Centimeter/100000;
        System.out.println("Distance in Meter:-"+Meter);
        System.out.println("Distance in Kilometer:-"+Kilometer);

    }
}

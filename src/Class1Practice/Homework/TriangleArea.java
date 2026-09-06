package Class1Practice.Homework;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base:-");
        int Base = sc.nextInt();
        System.out.println("Enter Height:-");
        int Height = sc.nextInt();
        System.out.println("Enter Side:-");
        int Side = sc.nextInt();
        System.out.println("Area will be:- "+(Base*Height)/2);
        System.out.println("Area of Equilateral Triange is :- "+(Math.sqrt(3)/4)*Math.pow(Side,2));
    }
}

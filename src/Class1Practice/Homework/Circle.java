package Class1Practice.Homework;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:-");
        int r = sc.nextInt();
        System.out.println("Diameter is :-"+2*r);
        System.out.println("Circumference is :- "+2*Math.PI*r);
        System.out.println("Area is :-"+Math.PI*Math.pow(r,2));

    }
}

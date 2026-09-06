package Class1Practice.Homework;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:-");
        float len = sc.nextFloat();
        System.out.println("Enter Breath:-");
        float br = sc.nextFloat();
        float Area = len*br;
        float Perimeter = 2*(len + br);
        System.out.println("Area is"+Area);
        System.out.println("Perimeter is "+Perimeter);
    }
}

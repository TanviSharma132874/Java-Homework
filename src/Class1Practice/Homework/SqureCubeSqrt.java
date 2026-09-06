package Class1Practice.Homework;

import java.util.Scanner;


public class SqureCubeSqrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//// Math.pow() contains 2 parameters....
//        System.out.println("Square is:"+Math.pow(num, 2));
//        System.out.println("Square is:"+Math.pow(num, 3));
//        System.out.println("Square is:"+Math.sqrt(num));

        System.out.println("Enter x:-");
        int x = sc.nextInt();

        System.out.println("Enter y:-");
        int y = sc.nextInt();

        System.out.println("Answer:-"+Math.pow(x,y));


    }
}

package Class1Practice.Homework;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;

        System.out.println("Sum is :"+sum);
        System.out.println("Difference is :"+diff);
        System.out.println("Product is :"+num1*num2);
        System.out.println("Quotient is :"+num1/num2);
        System.out.println("Remainder is :"+num1%num2);
    }
}

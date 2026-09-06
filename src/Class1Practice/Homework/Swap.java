package Class1Practice.Homework;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int a = 10;
//        int b = 20;
        int a = 60;
        int b = 50;
        System.out.println("Before Swapping a is:"+a+" b is:"+b);
//        int temp;
//        temp = a;
//        a = b;
//        b= temp;

//        a = a+b;
//        b = a-b;
//        a = a-b;
          a = a*b;
          b = a/b;
          a = a/b;

        System.out.println("After Swapping a is:"+a+" b is:"+b);

    }
}

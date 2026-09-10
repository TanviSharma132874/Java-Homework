package Class3Practice;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2:");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("num1 is greater.");
        }else{
            System.out.println("num2 is greater.");
        }
    }
}

package Class3Practice;

import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}

package Class3Practice;

import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();;
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        if(a == b && b ==c){
            System.out.println("Equilateral");
        } else if (a==b || b==c || a == c) {
            System.out.println("Isosceles");
        } else if (a !=b && b != c && a!=c) {
            System.out.println("Scalene");
        }else{
            System.out.println("invalid triangle");
        }
    }
}

package Class3Practice;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

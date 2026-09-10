package Class3Practice;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int yy = sc.nextInt();
        if(yy%400==0 || yy%4==0 && yy%100!=0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a Leap Year.");
        }
    }
}

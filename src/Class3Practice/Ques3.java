package Class3Practice;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = sc.nextInt();
        if(Num%7 == 0){
            System.out.println("Number is divisible by 7");
        }else{
            System.out.println("Number is not divisible by 7");
        }
    }
}

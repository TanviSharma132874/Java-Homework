package Class3Practice;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = sc.nextInt();
        if(Num>0){
            System.out.println("Number is Positive..");
        } else if (Num<0) {
            System.out.println("Number is Negative..");

        }else{
            System.out.println("Number is zero");
        }
    }
}

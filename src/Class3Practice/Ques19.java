package Class3Practice;

import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Angle1:");
        int Angle1 = sc.nextInt();
        System.out.println("Enter Angle2:");
        int Angle2 = sc.nextInt();
        System.out.println("Enter Angle3:");
        int Angle3 = sc.nextInt();
        if(Angle1+Angle2+Angle3==180 && Angle1>0 && Angle2>0 && Angle3>0){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}

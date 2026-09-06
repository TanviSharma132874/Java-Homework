package Class1Practice.Homework;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:-");
        double P = sc.nextDouble();
        System.out.println("Enter R:-");
        double R = sc.nextDouble();
        System.out.println("Enter T:-");
        double T = sc.nextDouble();
        double SI = (P*R*T)/100;
//        System.out.println("Simple Interest will be:-"+SI);
//        double Amount = P + SI;
        double Amount = P*Math.pow((1+R/100), T);
        double CI = Amount - P;
        System.out.println("Compund Interest will be :-"+CI);
        System.out.println("Total Amount is:"+Amount );
    }
}

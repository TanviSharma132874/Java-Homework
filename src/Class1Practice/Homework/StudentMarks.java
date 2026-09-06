package Class1Practice.Homework;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S1 Marks:");
        float S1 = sc.nextFloat();
        System.out.println("Enter S2 Marks:");
        float S2 = sc.nextFloat();
        System.out.println("Enter S3 Marks:");
        float S3 = sc.nextFloat();
        System.out.println("Enter S4 Marks:");
        float S4 = sc.nextFloat();
        System.out.println("Enter S5 Marks:");
        float S5 = sc.nextFloat();

        float Total = S1+S2+S3+S4+S5;
        System.out.println("Total: "+Total);
        float Average = Total/5;
        System.out.println("Avg: "+Average);
        float per = (Total/500)*100;
        System.out.println("Percentage :-"+per);
    }
}

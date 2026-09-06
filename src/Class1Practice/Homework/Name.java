package Class1Practice.Homework;

import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String FName = sc.nextLine();
        System.out.println("Enter the Last Name: ");
        String LName = sc.nextLine();

        System.out.println("Full Name is :- " + FName + " "+ LName);

    }
}

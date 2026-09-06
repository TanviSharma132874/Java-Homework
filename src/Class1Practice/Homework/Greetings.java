package Class1Practice.Homework;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's Your Name:-");
        String Name = sc.nextLine();

        System.out.println("Hello " +Name+", Welcome!");
    }
}

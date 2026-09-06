package Class1Practice.Homework;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Word :-");
//        String Word = sc.next();
//        System.out.println("Enter a Character:-");
//        char c = sc.next().charAt(0);
//        int Tanu = (int) c;
//        int value = 65;
        System.out.println("Enter an ASCII Value:-");
        int value = sc.nextInt();

        char Ch = (char) value;
        System.out.println("The Character is:"+Ch);

//        System.out.println("The Ascii value of char:"+c+ " is "+Tanu);
//
//        System.out.println("The Length of the word is:- "+Word.length());
    }
}

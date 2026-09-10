package Class3Practice;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet:");
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        }else {
            System.out.println("not an Alphabet");
        }
    }
}

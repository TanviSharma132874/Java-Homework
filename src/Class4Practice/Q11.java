package Class4Practice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:-");
        int num = sc.nextInt();
        System.out.println("Enter Power:-");
        int power = sc.nextInt();
        int result = 1;
        for(int i =1; i<=power; i++){
        result = result * num;
        }
        System.out.println(result);
    }
}

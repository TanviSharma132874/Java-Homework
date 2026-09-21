package Class4Practice;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println("Enter a number:-");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime && num > 1) {
            System.out.println(num);
        }
    }
}




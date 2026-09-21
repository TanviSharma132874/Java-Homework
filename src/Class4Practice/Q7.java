package Class4Practice;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nutural number:-");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}

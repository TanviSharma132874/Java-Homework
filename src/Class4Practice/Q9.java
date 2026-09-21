package Class4Practice;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:-");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i<=num){
            if(i%2!=0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

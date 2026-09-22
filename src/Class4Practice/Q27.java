package Class4Practice;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int rev_num=0;
        while(num!=0){
            rem = num%10;
            rev_num = rev_num*10+rem;
            num= num/10;

        }
        if(rev_num == temp){
            System.out.println("Palindrom..");
        }else {
            System.out.println("NO Palindrom..");
        }
    }
}

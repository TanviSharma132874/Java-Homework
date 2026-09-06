package Class1Practice;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length = ");
        int length; //declaration
        length = sc.nextInt();  //initialization
        System.out.println("Enter the width = ");
        int width = sc.nextInt();


        System.out.println("Area is : "+length*width);

    }
}

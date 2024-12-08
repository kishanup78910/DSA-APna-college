package ConditionalStatement;

import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to drive");
        }else{
            System.out.println("You are not eligible to drive");
        }
    }
}

package ConditionalStatement;

import java.util.Scanner;

public class LargestOFTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        System.out.println("Enter second number:");
        int y=sc.nextInt();
        if(x==y){
            System.out.println("equal");
        }else if(x>y){
            System.out.println("largest number is "+x);
        }else{
            System.out.println("largest number is "+y);
        }
    }
}

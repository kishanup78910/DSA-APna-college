package ConditionalStatement;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest number is "+a);
        }else if(b>c && b>a){
            System.out.println("Largest number is "+b);
        }else{
            System.out.println("Largest is c"+c);
        }
    }
}

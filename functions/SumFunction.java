package functions;

import java.util.Scanner;

public class SumFunction {

    public static void Sum(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is "+sum);
    }

    public static int ParaMetrisedSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
       // Sum();
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int sum=ParaMetrisedSum(a,b);
       System.out.println("Sum of two numbers parametrised is "+sum);

    }
}

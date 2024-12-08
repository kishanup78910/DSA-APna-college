package ConditionalStatement;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Income = sc.nextInt();
        int tax = 0;

        if(Income<500000){
            tax = Income;
        }else if(Income>500000 && Income<1000000){
            tax = Income*20/100;
        }else{
            tax= Income*30/100;
        }
        float netPay = Income-tax;
        System.out.println("Your salary become "+netPay);
    }
}

package ConditionalStatement;

import java.util.Scanner;

public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        String reportCard = marks >=33 ? "Pass" : "Fail";
        System.out.println("Your report card is "+reportCard);
    }
}

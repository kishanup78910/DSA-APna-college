package Assignment;

import java.util.Scanner;

/*
 *  Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

 public class CQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of the pencil:");
        while (!sc.hasNextFloat()) { // Validate input
            System.out.println("Invalid input! Please enter a valid float number:");
            sc.next(); // Discard invalid input
        }
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of the pen:");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid float number:");
            sc.next();
        }
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of the eraser:");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid float number:");
            sc.next();
        }
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total cost: " + total);

        // Fix GST calculation
        float gst = (18f / 100) * total;
        float finalBill = total + gst;

        System.out.println("GST (18%): " + gst);
        System.out.println("Final bill (including GST): " + finalBill);
    }
}

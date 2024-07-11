package practice;

import java.util.Scanner;

public class FloatingPointArithmetic {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
 
        System.out.print("Enter the first floating point number: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Enter the second floating point number: ");
        float num2 = sc.nextFloat();
        
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float quotient = 0.0f;
        
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
        }
        
       
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }
        
    }
}

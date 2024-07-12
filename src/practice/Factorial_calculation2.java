package practice;

import java.util.Scanner;

public class Factorial_calculation2 {
	
	public static void main(String[] args) {
		
		int x, number , count ;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		
		 x=1;
		 
		for (count = 1; count <= number; ++count) {
            x = x * count;
        }
		
		if(number<1) {
			System.out.println("EXIT");
			break;
		}		
		
        System.out.println("factorial of " + number + ":" + x);
		}

    }
		
	}
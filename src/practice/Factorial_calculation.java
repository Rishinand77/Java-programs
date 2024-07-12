package practice;

import java.util.Scanner;

public class Factorial_calculation {
	
	public static void main(String[] args) {
		
		int x=1, count, number; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		
		
		
		for(count=1 ; count<=number ; count++) {
			
			x=x*count;
			
		}
		System.out.println(x);
		
	}

}

package practice;

import java.util.Scanner;

public class Factorial_calculation3 {
	
	public static void main(String []args) {
		
		int x , number , count;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Enter the number : ");
			number = sc.nextInt();
	
		x=1;
		
		for(count=1;count<=number;++count)
		{
			x=x*count;
		}
		
		if(number<1); {
			System.out.println("EXIT");
		}
		
		System.out.println("The factorial of "+number+" is: "+x );
		
		}	
	}

}

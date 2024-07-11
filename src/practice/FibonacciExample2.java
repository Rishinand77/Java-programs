package practice;

import java.util.Scanner;

public class FibonacciExample2 {

	public static void main(String []args) {
		
		int x1, x2, i , count, x3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("value of x1 : ");
		x1 = sc.nextInt();
		
		System.out.println("value of x2 : ");
		x2 = sc.nextInt();
		
		System.out.println("value of count : ");
		count = sc.nextInt();
		
	System.out.print(x1 +" "+ x2);
	
	for(i=2;i<count;++i) {
		
		x3= x1+x2;
		System.out.print(" "+x3);
		x1=x2;
		x2=x3;
		
		System.out.print("="+i+",");
		
	
	}
		
	}
	
}

package practice;

import java.util.Scanner;

public class Checking_of_leap_year {
	
	public static void main(String[] args) {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		year = sc.nextInt();
		
		if (year % 4 == 0) {
			System.out.println("This is a leap year");
			}
		else {
		System.out.println("This is not a leap year");
	}
	}
}

package practice;

import java.util.Scanner;

public class Checking_of_leap_year2 {
	
	public static void main(String[] args)
	{
      int year;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("year : ");
      year = sc.nextInt();
      
		boolean is_leap_year = false;

		if (year % 4 == 0) {
			is_leap_year = true;

			
		}

		else

			is_leap_year = false;

		if (!is_leap_year)
			System.out.println(year + " : Non Leap-year");
		else
			System.out.println(year + " : Leap-year");
	}

}



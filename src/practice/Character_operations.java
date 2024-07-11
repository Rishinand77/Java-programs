package practice;

import java.util.Scanner;

public class Character_operations {

	public static void main (String[] args) {
		
		char x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("char : ");
		x = sc.next().charAt(0);
		
		char upper_case_of_char = Character.toUpperCase(x);
		System.out.println("Upperr case of char : " + upper_case_of_char);
		
		char lower_case_of_char = Character.toLowerCase(x);
		System.out.println("Lower case of char : " + lower_case_of_char);
		
		int unicode_value = (int)x;
		System.out.println("Unicode value of char : " + unicode_value);
		
		 if (Character.isDigit(x)) {			 
			System.out.println("Character is digit");
		}
		 else {
			 System.out.println("Character is not a digit");
			 		 }
		 
		 if (Character.isLetter(x)) {			 
				System.out.println("Character is letter");
			}
			 else {
				 System.out.println("Character is not a letter");
				 		 }
			
		 if (Character.isWhitespace(x)) {
			 System.out.println("Character is a whitespace");
		 }
		 else {
			 System.out.println("Character is not a whitespace");
		 }
				
}	
}

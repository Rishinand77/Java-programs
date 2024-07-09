package IntegerArthemetic;

import java.util.Scanner;

public class String_Concatenation1 {
	
	public static void main (String [] args) {
	
	String str1,str2;
	int num1,num2;
	
	Scanner sc=new Scanner(System.in);
	
	
	
	System.out.println("Str1 : ");
	str1 = sc.next();
	
	System.out.println("Str2 : ");
	str2 = sc.next();
	
	System.out.println("num1 : ");
	num1 = sc.nextInt();
	
	System.out.println("num2 : ");
	num2 = sc.nextInt();
	
	System.out.println("Str1+str2+num1 : "+str1+" " +str2+ " "+num1);
	System.out.println("str1+num1 : " + "Datatype for str1+num1 : " + (str1+num1).getClass().getSimpleName());
	System.out.println("Datatype for num1+str1 : " + (num1+str1).getClass().getSimpleName());
//	System.out.println((num2+num1.getClass().getSimpleName());
	System.out.println("num1+num2 : "+num1+" "+num2);
	
	
	
	
	
	
	
	
	}
}

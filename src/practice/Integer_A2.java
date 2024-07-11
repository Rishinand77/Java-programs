package practice;

import java.util.Scanner;

public class Integer_A2 {
	

	
public static void main(String []args) {
	

	int var1,var2,result=0;
	String operation;
	
  Scanner sc = new Scanner(System.in);
  
	System.out.println("var1 : ");
	 var1 = sc.nextInt();
	
	System.out.println("var2 : ");
	 var2 = sc.nextInt();

	System.out.println("enter operation you want to perform : ");
	operation = sc.next();
	
	switch (operation) {
	
	case "+" :
	{
	result=var1+var2;
	System.out.println("addition : "+result);
	break;
	}
	
	case "-" :
	{
		result=var1-var2;
		System.out.println("substraction : "+result);
		break;
	}
	
	case "*" :
	{
		result=var1*var2;
		System.out.println("multiplication : "+result);
		break;
	}
	
	case "/" :
	{
		result=var1/var2;
		System.out.println("division : "+result);
		break;
	}
	
	case "%" :
	{
		result=var1%var2;
		System.out.println("remainder : "+result);
		break;
	}
		
	
    default :
    	{
    		System.out.println("Wrong Input");
    	}
}

}	
}

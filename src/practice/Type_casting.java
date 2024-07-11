package practice;

import java.util.Scanner;

public class Type_casting {
	
	public static void main (String[]args) {	
		
	Scanner sc = new Scanner(System.in);	

    System.out.println("Enter integer value : ");
    int integer_value = sc.nextInt();
    
    long long_value = integer_value;
	float float_value= integer_value;
	double double_value = integer_value;
    
    System.out.println("Implcit casting");
    
    System.out.println("integer value : "+integer_value);   
    System.out.println("converted to long : "+long_value);
    System.out.println("converted to float : "+float_value);
    System.out.println("converted to double : "+double_value);
    
    System.out.println(" ");
    
    System.out.println("Enter new double value : ");
    double new_double_value = sc.nextDouble();
    
	int new_int_value = (int) new_double_value;
	float new_float_value = (float) new_double_value;
	long new_long_value = (long) new_double_value;
    
    System.out.println("Explicit casting");
    
    System.out.println("double value : "+new_double_value);
    System.out.println("converted to integer : "+new_int_value);
    System.out.println("converted to long : "+new_long_value);
    System.out.println("converted to float : "+new_float_value);
    
}
}

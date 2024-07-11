package practice;

import java.util.Scanner;

public class BooleanLogic {
    public static void main(String[] args) {
      
    
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first boolean value (true/false): ");
        boolean bool1 = sc.nextBoolean();
        
        System.out.print("Enter the second boolean value (true/false): ");
        boolean bool2 = sc.nextBoolean();
        
        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notBool1 = !bool1;
        boolean notBool2 = !bool2;
        
        System.out.println("AND operation result (bool1 && bool2): " + andResult);
        System.out.println("OR operation result (bool1 || bool2): " + orResult);
        System.out.println("NOT operation result (!bool1): " + notBool1);
        System.out.println("NOT operation result (!bool2): " + notBool2);
        
        
    }
}


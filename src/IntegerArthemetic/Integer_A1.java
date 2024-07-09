package IntegerArthemetic;

import java.util.Scanner;

public class Integer_A1 {

	public static class Values {

		int a,b ;

		}

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Values obj = new Values();

		System.out.println("a : ");
		int a = sc.nextInt();

		System.out.println("b : ");
		int b = sc.nextInt();

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}

		}

package practice;

public class FibonacciExample2 {

	public static void main(String []args) {
		
		int x1 = 2, x2 = 3, x3 ,i , count=7;
	System.out.print(x1 +" "+ x2);
	
	for(i=0;i<count;++i) {
		
		x3= x1+x2;
		System.out.print(" "+x3);
		x1=x2;
		x2=x3;
		
		System.out.print("="+i+",");
		
	
	}
		
	}
	
}

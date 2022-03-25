package lab1;
import java.util.Scanner;
public class Ex3 
{
	 static int recerfib(int n) 
	 {
		 if (n <= 1)
		 {
			 return n;
		 }
		 return recerfib(n-1) + recerfib(n-2);	      
	 }
	 
	 static int nonrecurfib(int n)
	 {
		 if (n <= 1)
		 {
			 return n;
		 }
		 int n0 = 0, n1 = 1;
		 for (int i = 0; i < n - 1; i++)
		 {
			 int n2 = n0 + n1;
			 n0 = n1;
			 n1 = n2;
		 }
		 return n1;
	  }
	  
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Nth value of Fibonacci sequence using recursive function:"+recerfib(n));
		
		System.out.println("Nth value of Fibonacci sequence using nonrecursive function:"+nonrecurfib(n));
		
	}

}

package lab1;
import java.util.Scanner;
public class Ex1 
{	
	int n;
	int cube(int a) 
	{
		int temp;
		int num=a;
		int sum=0;
		while(num>0) 
		{
			temp=num%10;
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		
		Ex1 e = new Ex1();
		int res;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		e.n=sc.nextInt();
		res=e.cube(e.n);
		System.out.println("Sum of cube of digits:"+res);
	}

}
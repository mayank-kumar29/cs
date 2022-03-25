package lab1;
import java.util.Scanner;
public class Ex8 
{
	static boolean checkNumber(int n)
	{
		boolean b=false;
		int num=n,t1,t2,temp;
		if(num==0)
		{
			return b;
		}
		while(num!=1) 
		{
			if(num%2!=0)
			{
				return b;
			}
			else
			{
				num=num/2;
			}
		}
		b=true;
		return b; 
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The number is a power of two:"+checkNumber(n));
	}

}

package lab1;
import java.util.Scanner;
public class Ex5 
{
	static int calculateSum(int n)
	{
		int sum=0,k;
		for(int i=0;i<=n;i++) 
		{
			k=0;
			if(i%3==0 || i%5==0)
			{
				k++;
			}
			if(k>0) 
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Sum:"+calculateSum(n));
	}

}

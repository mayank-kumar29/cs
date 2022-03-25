package lab1;
import java.util.Scanner;
public class Ex6 
{
	static int calculateDifference(int n)
	{
		int sum1=0,sum2=0,diff;
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		sum2=sum2*sum2;
		diff=sum1-sum2;
		return diff;
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Difference:"+calculateDifference(n));
	}

}

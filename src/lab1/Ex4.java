package lab1;
import java.util.Scanner;
public class Ex4 
{

	public static void main(String[] args) 
	{
		int n,k=0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Prime numbers upto n:");
		for(int i=1;i<=n;i++) 
		{
			k=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					k++;
				}
			}
			if(k==2)
			{
				System.out.println(i);
			}
		}
	}

}

package lab1;
import java.util.Scanner;
public class Ex7 
{
	static boolean checkNumber(int n)
	{
		boolean b=false;
		int num=n,t1,t2,temp;
		while(num>0) 
		{
			temp=num;
			t2=num%10;
			t1=(temp/10)%10;
			if(t1<t2) 
			{
				b=true;
			}
			else 
			{
				b=false;
				return b;
			}
		num=num/10;
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The number is an increasing number:"+checkNumber(n));
	}

}

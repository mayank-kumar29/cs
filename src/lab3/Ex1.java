package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String temp = new String();
		int sum = 0;
		System.out.println("Enter the line of integers:");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("The integers:");
		while(st.hasMoreTokens())
		{
			 temp = (String)st.nextElement();
			 System.out.println(temp);
			 sum=sum+Integer.parseInt(temp);
		}
		System.out.println("Sum:"+sum);
	}

}

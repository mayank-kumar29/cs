package lab3;

import java.util.Scanner;

public class Ex8 
{
	static boolean checkString(String str)
	{
		boolean b = false;
		int n1,n2;
		for (int i = 0; i < str.length()-1; i++)
		{
			n1 = str.charAt(i);
			n2 = str.charAt(i+1);
			if(n2-n1 >= 0)
			{
				b = true;
			}
			else
			{
				b = false;
				return b;
			}
		}
		return b;
		
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string:");
		str = sc.nextLine();
		System.out.println("Resulting string:"+checkString(str));
	}

}

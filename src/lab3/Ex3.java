package lab3;

import java.util.Scanner;

public class Ex3 
{
	static String alterString(String s)
	{
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) 
		{
			if(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' && c[i] != 'A' && c[i] != 'E' &&	c[i] != 'I' && c[i] != 'O' && c[i] != 'U')
			{
				c[i] = (char)(c[i]+1);
			}
		}
		String res = new String(c);
		return res;
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string:");
		str = sc.nextLine();
		System.out.println("Resulting string:"+alterString(str));
	}

}

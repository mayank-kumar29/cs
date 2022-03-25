package lab3;

import java.util.Scanner;

public class Ex2 
{
	static String getImage(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		StringBuffer temp = new StringBuffer(s);
		sb.reverse();
		temp.append("|");
		temp.append(sb);
		String res = new String(temp.toString());
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string:");
		str = sc.nextLine();
		System.out.println("Resulting string:"+getImage(str));
	}

}

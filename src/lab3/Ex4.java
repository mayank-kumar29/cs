package lab3;

import java.util.Scanner;

public class Ex4 
{
	static int modifyNumber(int n)
	{
		int res,t1,t2,temp;
		res = 0;
		char ch1,ch2;
		String str = Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length()-1; i++) 
		{
			ch1 = str.charAt(i);
			ch2 = str.charAt(i+1);
			t1 = Character.getNumericValue(ch1);
			t2 = Character.getNumericValue(ch2);
			temp = t1-t2;
			if(temp<0)
			{
				temp = temp*(-1);
			}
			sb.append(temp);
			
		}
		ch1 = str.charAt(str.length()-1);
		ch2 = str.charAt(0);
		t1 = Character.getNumericValue(ch1);
		t2 = Character.getNumericValue(ch2);
		temp = t1-t2;
		if(temp<0)
		{
			temp = temp*(-1);
		}
		sb.append(temp);
		String s = new String(sb.toString());
		res = Integer.parseInt(s);
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		System.out.println("Resulting number:"+modifyNumber(n));
	}

}

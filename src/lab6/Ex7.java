package lab6;

import java.util.Arrays;

public class Ex7 
{
	static int[] getSorted(int[] a)
	{
		int size = a.length;
		int[] res = new int[size];
		String str = Arrays.toString(a);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str.charAt(2));
		System.out.println(sb);
		size = sb.length();
		for (int i = 0; i < size; i++)
		{
			char ch = sb.charAt(i);
			String temp = sb.toString();
			//res[i] = Integer.parseInt(temp);
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		int[] a = {1,3,5,2,4};
		getSorted(a);
		//System.out.println("Resulting Array:"+Arrays.toString(getSorted(a)));
	}

}

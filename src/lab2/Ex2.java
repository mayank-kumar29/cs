package lab2;
import java.util.*;

public class Ex2 
{
	static String[] sortStrings(String[] a)
	{
		String[] res = new String[a.length];
		Arrays.sort(a);
		res = a;
		int n = res.length;
		for(int i = 0; i < (n/2); i++)
		{
			res[i] = res[i].toUpperCase();
		}
		return res;
	}
	public static void main(String[] args)
	{
		String[] a = {"bb","aa","dd","cc","ff"};
		System.out.println("Resulting Array:"+Arrays.toString(sortStrings(a)));
	}

}

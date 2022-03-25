package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex5
{
	static int getSecondSmallest(int []a)
	{
		int n;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : a)
		{
			list.add(i);
		}
		Collections.sort(list);
		n = list.get(1);
		return n;
	}
	public static void main(String[] args) 
	{
		int[] a = {1,3,4,5,7,8,6,9,10,2};
		System.out.println("The second smallest number:"+getSecondSmallest(a));
	}
}
	
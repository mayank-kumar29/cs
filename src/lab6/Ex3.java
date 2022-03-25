package lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex3 
{
	static Map<Integer,Integer> getSquares(int[] n)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < n.length; i++)   
        {  
			map.put(n[i],n[i]*n[i]);
        } 
		return map;	
	}
	public static void main(String[] args) 
	{
		int[] n = {1,2,3,4,5};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(getSquares(n));
		for (int i : map.keySet()) 
		{
			System.out.println("Number:"+i);
			System.out.println("Square:"+map.get(i));
		}
		
	}
	
}

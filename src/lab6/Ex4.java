package lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex4 
{
	static Map<Integer,String> getStudents(Map<Integer,Integer> map)
	{
		int n;
		Map<Integer,String> res = new HashMap<Integer,String>();
		for (int i : map.keySet())
		{
			n = map.get(i);
			if(n >= 90)
			{
				res.put(i, "Gold Medal");
			}
			else if(n < 90 && n >= 80)
			{
				res.put(i, "Silver Medal");
			}
			else if(n < 80 && n >= 70)
			{
				res.put(i, "Bronze Medal");
			}
			else
			{
				res.put(i, "No Medal");
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(101, 50);
		map.put(102, 95);
		map.put(103, 80);
		map.put(104, 70);
		map.put(105, 85);
		for (int i : map.keySet()) 
		{
			System.out.println("Registration Number:"+i);
			System.out.println("Marks:"+map.get(i));
		}
		Map<Integer,String> res = new HashMap<Integer,String>();
		res.putAll(getStudents(map));
		for (int i : res.keySet()) 
		{
			System.out.println("Registration Number:"+i);
			System.out.println("Medal:"+res.get(i));
		}
		
	}

}

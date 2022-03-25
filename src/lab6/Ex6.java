package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex6 
{
	
	static List<Integer> votersList (Map<Integer,Integer> map)
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i : map.keySet())   
        {  
			if(map.get(i) >= 18)
			{
				list.add(i);
			}
        } 
		return list;	
	}
	public static void main(String[] args) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(101,15);
		map.put(102,25);
		map.put(103,18);
		map.put(104,17);
		List<Integer> list = new ArrayList<Integer>(votersList(map));
		for(int i : list)
		{
			System.out.println(i);	
		}

	}
	
}

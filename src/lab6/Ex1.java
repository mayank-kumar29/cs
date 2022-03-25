package lab6;
import java.util.*;

public class Ex1 
{
	static List<String> getValues(Map<Integer,String> map)
	{
		List<Integer> temp = new ArrayList<Integer>(map.keySet());
		List<String> list = new ArrayList<String>();
		Collections.sort(temp);
		for(int i : temp)
		{
			list.add(map.get(i));
		}
		return list;	
	}
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "First");
		map.put(3, "Third");
		map.put(4, "Fourth");
		map.put(2, "Second");
		List<String> list = new ArrayList<String>(getValues(map));
		for(String str : list)
		{
			System.out.println(str);	
		}
	}

}

package lab6;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2 
{
	static Map<Character,Integer> countChars(char[] ch)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < ch.length; i++)   
        {  
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i],1);
			}
        } 
		return map;
	}
	public static void main(String[] args) 
	{
		char[] ch = {'a','a','a','b','b','c','c','d'};
		Map<Character,Integer> map = new HashMap<Character,Integer>(countChars(ch));
		for (char c : map.keySet()) 
		{
			System.out.println("Character:"+c);
			System.out.println("Frequency:"+map.get(c));
		}
	}

}

package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable 
{

	public static void main(String[] args) 
	{
		List <Id> list = new ArrayList<Id>();  
		list.add(new Id(101,"A"));  
		list.add(new Id(103,"C"));  
		list.add(new Id(102,"B")); 
		Collections.sort(list);  
		for(Id i: list)
		{  
			System.out.println(i.idno+" "+i.name);  
		}  
	}

}

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator 
{
	public static void main(String[] args) 
	{
		List <Student> list = new ArrayList<Student>();  
		list.add(new Student("A",20));  
		list.add(new Student("C",18));  
		list.add(new Student("B",25)); 
		System.out.println("Sorting by Name:");  
		Collections.sort(list,new NameCompare());   
		for(Student s : list)
		{  
			System.out.println(s.name+" "+s.age);  
		}    
		System.out.println("Sorting by Age:");   
		Collections.sort(list,new AgeCompare());   
		for(Student s : list)
		{  
			System.out.println(s.name+" "+s.age);  

		}  
	}

}
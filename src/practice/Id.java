package practice;
import java.util.*;  
import java.io.*;  

public class Id implements Comparable<Id>
{ 
	int idno;  
	String name;  
	Id(int idno,String name)
	{  
		this.idno = idno;  
		this.name=name;  
	}  
	public int compareTo(Id i)
	{  
		if(idno == i.idno) 
		{
			return 0;
		}
		else if(idno > i.idno)  
		{
			return 1;
		}
		else
		{
			return -1;  
		}
	}
}

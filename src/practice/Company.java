
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company 
{
	List<Employee> empList = new ArrayList<Employee>();
	public List<String> highPayList()
	{
		List<String> al = new ArrayList<String>();
		Collections.sort(empList,new Sorting());   
		for(Employee e : empList)
		{  
			 al.add(e.getName());
		}    
		return al;
	}
}

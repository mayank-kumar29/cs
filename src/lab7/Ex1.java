package lab7;
import java.util.HashMap;
import java.util.Map;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.UserIO;

public class Ex1 
{
	
	public static void main(String[] args) 
	{
		Map<Integer,Employee> map = new HashMap <Integer,Employee>();
		UserIO io = new UserIO();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		map.put(1, e1);
		map.put(1, e2);
		Employee e = map.get(1);
		io.add(e);
		io.display(e);
		io.services(e);
	}

}

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApp {

	public static void main(String[] args) 
	{  
		Employee data1 = new Employee("Intern",20);  
		Employee data2 = new Employee("CEO",20000);  
		Employee data3 = new Employee("Developer",5000); 
		Company obj = new Company();
		obj.empList.add(data1);
		obj.empList.add(data2);
		obj.empList.add(data3);
		//obj.highPayList();
		System.out.println(obj.highPayList());
	}

}

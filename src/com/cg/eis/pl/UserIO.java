package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class UserIO implements EmployeeService
{
	public void add(Employee e)
	{
		int id,salary;
		String name,designation,insurance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = sc.nextInt();
		System.out.print("Enter Name:");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Salary:");
		salary = sc.nextInt();
		if (salary <= 5000)
		{
			designation = "Clerk";
			insurance = "No Scheme";
		}
		else if(salary > 5000 && salary <20000)
		{
			designation = "System Associate";
			insurance = "Scheme C";
		}
		else if(salary >= 20000 && salary <40000)
		{
			designation = "Programmer";
			insurance = "Scheme B";
		}
		else
		{
			designation = "Manager";
			insurance = "Scheme A";
		}
		e.setId(id);
		e.setDesignation(designation);
		e.setInsurance(insurance);
		e.setName(name);
		e.setSalary(salary);
		
	}
	public void display(Employee e)
	{
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getDesignation());
		System.out.println(e.getInsurance());
	}
	@Override
	public void services(Employee e) 
	{
		String services = null;
		if(e.getInsurance().equals("No Scheme"))
		{
			services = "No Services";
		}
		else if(e.getInsurance().equals("Scheme A"))
		{
			services = "A Services";
		}
		else if(e.getInsurance().equals("Scheme B"))
		{
			services = "B Services";
		}
		else if(e.getInsurance().equals("Scheme B"))
		{
			services = "C Services";
		}
		System.out.println(services);
	}

}

package lab5;
import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class Ex3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary:");
		int salary = sc.nextInt();
		try 
		{
			if(salary < 3000)
			{
				throw new EmployeeException("Salary is less than 3000");
			}
		}
		catch(EmployeeException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of Program");	
	}
	
}

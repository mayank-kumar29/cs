package lab5;

import java.util.Scanner;

public class Ex2 
{

	public static void main(String[] args) 
	{
		String fName = null;
		String lName = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		fName = sc.nextLine();
		System.out.println("Enter LAst name:");
		lName = sc.nextLine();
		try 
		{
			if(fName.isEmpty() && lName.isEmpty())
			{
				throw new UserDefinedException("Fist name and Last name is blank");
			}
		}
		catch(UserDefinedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of Program");
	}

}

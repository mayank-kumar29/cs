package lab5;

import java.util.Scanner;

public class Ex1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		try 
		{
			if(age <= 15)
			{
				throw new UserDefinedException("Age is not more than 15");
			}
		}
		catch(UserDefinedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of Program");
	}

}

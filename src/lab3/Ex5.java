package lab3;

import java.util.Scanner;
public class Ex5 
{
	public static void main(String[] args) 
	{
		int numChar = 0, numLine = 1, numWord = 1;
		Scanner sc = new Scanner(System.in);
		String str = "Hello,\nhow are you?";
		System.out.println("Text:\n"+str);
		for (int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i)== ' '|| str.charAt(i)=='\n'))
			{
				numWord++;
			}
			if(str.charAt(i)=='\n')
			{
				numLine++;
			}
			numChar++;
		}
		System.out.println("Number of Characters:"+numChar+"\nNumber of Words:"+numWord+"\nNumber of Lines:"+numLine);
	
	}

}

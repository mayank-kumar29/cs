package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex9 
{
	static void dateDiff(int y, int m, int d)
	{
		LocalDate sdate = LocalDate.of(y,m,d);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(sdate, now);
        System.out.println("Difference:\n"+ diff.getYears()+"Years "+ diff.getMonths()+"Months "+ diff.getDays()+"Days");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int y,m,d;
		System.out.println("Enter the year:");
		y = sc.nextInt();
		System.out.println("Enter the month:");
		m = sc.nextInt();
		System.out.println("Enter the day:");
		d = sc.nextInt();
		dateDiff(y,m,d);
	}

}

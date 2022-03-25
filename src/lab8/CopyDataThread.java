package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread
{
	FileInputStream fis;
	FileOutputStream fos;
	public CopyDataThread(FileInputStream fis, FileOutputStream fos) 
	{
		this.fis = fis;
		this.fos = fos;
	}
	public void run() 
	{
		int num;
		int count = 1;
		try 
		{
			while ((num = fis.read()) != -1) 
			{
				System.out.println((char) num);
				fos.write(num);
				if(count%10 == 0)
				{
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				}
				count++;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

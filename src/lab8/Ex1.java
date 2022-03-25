package lab8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fis =  new FileInputStream("D:\\JAVA AWS\\Core Java\\src\\lab8\\source.txt");
		FileOutputStream fos = new FileOutputStream("D:\\JAVA AWS\\Core Java\\src\\lab8\\target.txt");; 
		CopyDataThread cdt = new CopyDataThread(fis,fos);
		Thread t = new Thread(cdt);
		t.start();	
	}

}

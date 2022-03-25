package lab8;
class MyThread implements Runnable
{
	public void run() 
	{
		while(true)
		{
			System.out.println(java.time.LocalTime.now());
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
public class Ex2 
{
	public static void main(String[] args) 
	{
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();	
	}
}

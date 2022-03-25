package practice;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapDemo extends Thread
{
	static ConcurrentHashMap<Integer,String> chmap = new ConcurrentHashMap<Integer,String>();
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			ConcurrentHashMapDemo.chmap.put(104,"john");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
class HashMapDemo extends Thread
{
	static HashMap<Integer,String> hmap = new HashMap<Integer,String>();
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			HashMapDemo.hmap.put(104,"john");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}

class ConcurrentDemo
{
	
	public static void main(String[] args) throws InterruptedException
	{
		ConcurrentHashMapDemo chm = new ConcurrentHashMapDemo();
		HashMapDemo hm = new HashMapDemo();
		Thread t1 = new Thread(hm);
		Thread t2 = new Thread(chm);
		HashMapDemo.hmap.put(101,"jake");
		HashMapDemo.hmap.put(102,"james");
		HashMapDemo.hmap.put(103,"smith");
		ConcurrentHashMapDemo.chmap.put(101,"jake");
		ConcurrentHashMapDemo.chmap.put(102,"james");
		ConcurrentHashMapDemo.chmap.put(103,"smith");
		//t1.start();
		for (int i : HashMapDemo.hmap.keySet())
		{
			System.out.println("id = "+ i +" name = "+HashMapDemo.hmap.get(i));
			Thread.sleep(1000);
		}
		t2.start();
		System.out.println(HashMapDemo.hmap);
		for (int i : ConcurrentHashMapDemo.chmap.keySet())
		{
			System.out.println("id = "+ i +" name = "+ConcurrentHashMapDemo.chmap.get(i));
			Thread.sleep(1000);
		}
		System.out.println(ConcurrentHashMapDemo.chmap);
	}
}

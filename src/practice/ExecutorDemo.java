package practice;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo 
{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		String[] strArr = {"john","james","smith"};
		ExecutorService service  = Executors.newFixedThreadPool(3);
		for(String str : strArr)
		{
			Future f = service.submit(() -> 
			{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
				return (str.toUpperCase());
			});
			System.out.println(f.get());
		}
		service.shutdown();
	}

}

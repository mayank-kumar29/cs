package practice;

public class ThreadGroupDemo implements Runnable 
{
	public void run() 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		ThreadGroupDemo tg = new ThreadGroupDemo();
		Thread t1 = new Thread(tg);
		Thread t2 = new Thread(tg);
		t1.start();
		t2.start();
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName()); 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		ThreadGroup tg1 = new ThreadGroup("ThreadGroup1");	
		Thread t3 = new Thread(tg1, tg);
		Thread t4 = new Thread(tg1, tg);
		t3.start();
		t4.start();
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t3.getThreadGroup().getName());
		System.out.println(t4.getThreadGroup().getName());
		System.out.println(t3.getThreadGroup().getParent());
		System.out.println(t4.getThreadGroup().getParent());		
		ThreadGroup tg2 = new ThreadGroup("ThreadGroup2");
		Thread t5 = new Thread(tg2, tg);
		t5.start();
		System.out.println(t5.getThreadGroup().getName());
		System.out.println(t5.getName());
		System.out.println(t5.getThreadGroup().getParent());	
		ThreadGroup tg3 = new ThreadGroup("ThreadGroup3");
	    System.out.println("main thread group activeGroupCount: "+Thread.currentThread().getThreadGroup().activeGroupCount()); 
	    System.out.println("main thread group activeCount: "+Thread.currentThread().getThreadGroup().activeCount());
	    System.out.println("tg1 active count: "+tg1.activeCount());
	    tg1.list();
	    System.out.println(t3.getPriority());
	    System.out.println(t4.getPriority());
		
	}

}
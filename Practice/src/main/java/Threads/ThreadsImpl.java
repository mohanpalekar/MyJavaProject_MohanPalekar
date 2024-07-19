package Threads;

public class ThreadsImpl {
	
	public static void main(String[] args) throws InterruptedException {
		
		Threads1InJava t1 = new Threads1InJava();
		
		t1.start();
		
		System.out.println(Thread.currentThread());
		
		Thread.sleep(5000);
		
		Thread t2 = new Thread(new Thread2InJava());
		
		t2.start();
	

	}

}

package Threads;

public class Thread2InJava implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 - Runnable");
		
		int i=0;
		while(i!=5) {
			System.out.println(i);
			i++;
		}
		
	}

}

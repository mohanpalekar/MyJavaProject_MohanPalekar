package Threads;

public class CounterIpml {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1; i<1001; i++) {
					counter.increment1();
					System.out.println("T1");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=1; i<501; i++) {
					counter.increment1();
					System.out.println("T2");
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Counter : "+counter.getCount());
		
		System.out.println("Program is over");	
	}

}

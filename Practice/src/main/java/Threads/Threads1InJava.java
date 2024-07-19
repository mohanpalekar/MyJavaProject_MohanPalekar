package Threads;

public class Threads1InJava extends Thread{


	public void run() {
		System.out.println("I am Thread 1");
		
		for(int i=0; i<6; i++) {
			System.out.println(i);
		}
	}

}

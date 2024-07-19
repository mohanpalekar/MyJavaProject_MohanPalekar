package Threads;

public class ThreadImpl {

	public static void main(String[] args) {
		int i=0;
		
		T1 t1 = new T1();

		t1.run(1);

		T2 t2 = new T2();

		t2.run(i);
	}

}

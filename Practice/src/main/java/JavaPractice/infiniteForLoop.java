package JavaPractice;

public class infiniteForLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<10000000; i++) {
			if(i==10) {
				break;
			}
			System.out.println(i);
		}
	}

}

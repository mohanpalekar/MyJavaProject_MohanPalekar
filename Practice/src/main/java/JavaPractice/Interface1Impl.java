package JavaPractice;

public class Interface1Impl implements InterFace1 {

	@Override
	public void method1() {
		System.out.println("I am the body of method1");

	}

	@Override
	public int method2() {

		return 100;
	}

	public static void main(String[] args) {

		Interface1Impl i1 = new Interface1Impl();
		

		i1.method1();
		
		System.out.println(i1.method2());
		
		
	}



}

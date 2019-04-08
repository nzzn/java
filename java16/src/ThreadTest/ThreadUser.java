package ThreadTest;

public class ThreadUser {

	public static void main(String[] args) {

		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		ThreadTest3 t3 = new ThreadTest3();
		
		t1.run();
		
		t2.run();
		
		t3.run();
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
	}

}

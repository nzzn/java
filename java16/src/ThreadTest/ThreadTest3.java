package ThreadTest;

public class ThreadTest3 extends Thread{
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
	
			System.out.println("나는 쓰레드3 : " + i);
}	
	
	}

}

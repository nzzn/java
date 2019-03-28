package java09;

public class Tv { // Tv 부품 ==> 클래스
	// Tv (클래스)
	// 정적특징 - 모양, 크기
	String shape;
	int size;

	// 동적특징 - 켜다, 끄다, 바꾸다
	public void on() {
		System.out.println("Tv를 켜다");
	}

	public void off() {
		System.out.println("Tv를 끄다");
	}

	public void change() {
		System.out.println("채널을 바꾸다");
	}

}

package java10;

public class Phone {
	// 정적특징 (멤버변수, 전역변수)
	// 모양, 색, 통신사
	String shape;
	String color;
	String tele;

	// 동적특징 => 메소드
	// 음악을 듣다, 전화하다
	public void music() {
		System.out.println("음악을 듣다");
	}

	public void call() {
		System.out.println("전화하다");
	}

}

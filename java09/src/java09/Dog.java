package java09;

public class Dog {
	// Dog ==> 클래스(class) ==> 틀
	// 정적특징 : 색깔, 꼬리길이 ==> 멤버변수
	String color;
	int tail;

	// 동적특징: 꼬리를 흔들다, 짖다 ==> 멤버메소드
	public void shake() {
		System.out.println("꼬리를 흔들다");
	}

	public void bark() {
		System.out.println("짖다");
	}

}

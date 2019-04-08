package Bank;

public class BadBank extends Bank {

	// 재정의
	@Override
	public void Interest() {

		System.out.println("대출 이자율이 20%");

	}

	public void badinterest() {

		System.out.println("적금 이자율이 낮다");
	}
}

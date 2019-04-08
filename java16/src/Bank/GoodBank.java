package Bank;

public class GoodBank extends Bank {

	// 재정의
	@Override
	public void Interest() {

		System.out.println("대출 이자율이 1%");

	}

	public void goodinterest() {

		System.out.println("적금 이자율이 높다");
	}
}

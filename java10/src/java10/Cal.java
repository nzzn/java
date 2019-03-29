package java10;

public class Cal {
	// 부품(class) => 원형
	// 정적 특징
	// 동적 특징

	// 더하기
	public int add(int x, int y) {

		int result = x + y;

		return result;
	}

	// 빼기
	public int sub(int x, int y) {

		int result = x - y;

		return result;
	}

	// 곱하기
	public int mul(int price, int count) {

		int result = price * count;

		return result;
	}

	// 나누기
	public int div(int sum, int person) {

		int result = sum / person;

		return result;
	}

	public void welcome(String name) {
		System.out.println(name + "님 환영합니다");
	}

	public void point(String name, int point) {
		System.out.println(name + "님의 포인트는 " + point);
	}

}

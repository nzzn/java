package Box;

public class BoxingTest {

	public static void main(String[] args) {
		Integer i1 = new Integer("200"); // 클래스의 변수. 주소가들어있음//포장클래스 int를 포장해서 만듬
		int i2 = 100; // 그냥숫자들어있음
						// int -> integer 이거 boxing 기초형 ->클래스
		i1 = i2; // int를 주소에 집어넣음!! //지들끼린 왓다갔다함
		System.out.println(i1);

	}

}

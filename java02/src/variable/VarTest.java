package variable;

/*
 *프로그래머: 임아무개
 *날짜: 2019.03.19
 * 수정 원인: 변수 확인
 */
public class VarTest {

	public static void main(String[] args) {
		
			System.out.println("오늘은 두번쨰 날입니다.");
			System.out.println("-----------------");
			System.out.println();
			
			// = 대입연산자, 할당연산자
			// + 연결연산자

			byte time = 15;
			int seconds = 51245315;
			final double PI = 3.14;		//상수. 상수인변수는 대문자
										//상수는 값 변경 불가
			char LastName = '김';
			
			boolean lunch = true;
			
			System.out.println("지금 시각은: " + time);
			System.out.println("아침부터 지난 초는: " + seconds);
			System.out.println("PI의 값은: " + PI);
			System.out.println("나의 이름 첫글자는: "+ LastName);
			System.out.println("점심을 먹었나요: " + lunch);
			
			String name ="김아무개";
			
			System.out.println("나의 전체 이름은 " + name);
			
			
			
			
			
		
	}

}

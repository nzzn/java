package java15;

public class ExceptionTest {

	public void call() {
		int[] num = { 1, 2, 3 };

		try {
			num[3] = 4; // 에러
		} catch (Exception e) {
			
			System.out.println("에러임 첵첵");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {

			System.out.println("무조건 실행되는 부분");
			System.out.println("파일을 close");

		}

		System.out.println("출력 가능?");
		
	}
}

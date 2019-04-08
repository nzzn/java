package java15;

public class ExceptionUser2 {

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		try {

			test.call();

		} catch (Exception e) {

			e.printStackTrace();
		}

		// 에러직접처리하거나
		// jvm한테 넘기거나
	}

}

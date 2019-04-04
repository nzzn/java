package java14;

import java.util.Random;

public class RandomSeedTest {

	public static void main(String[] args) {

		Random r = new Random(15325);  //<-- 가로안에 숫자넣으면 됨 시드~

		for (int i = 0; i < 10; i++) {
			
			System.out.println(r.nextInt(100));
		}
		

	}

}

package array;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//�������� �迭�� �־�ô�.
		
		Random random = new Random();			//Math.random();
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(46);
		}
		for (int i : lotto) {
			System.out.print(i + "  ");
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
				
	}
	
}


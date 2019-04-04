package java14;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {

		String str1 = new String("나른한 오후");
		String str2 = new String("2019/04/04");

		StringTokenizer t1 = new StringTokenizer(str1);
		StringTokenizer t2 = new StringTokenizer(str2, "/");

		System.out.println(t1.countTokens());
		System.out.println(t2.countTokens());

		while (t1.hasMoreTokens()) {
			System.out.println(t1.nextToken());
		}
		while (t2.hasMoreTokens()) {
			System.out.println(t2.nextToken());
		}

	}

}

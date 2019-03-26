
public class ArrayTest5 {

	public static void main(String[] args) {

		int[] num = { 33, 44, 77, 88, 12, 5 };
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}

		System.out.println("제일 작은 숫자는: " + min);

	}
}
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = { 44,77,22,33,99,11 };
		Arrays.sort(num);
		
		
		System.out.print("Ž���� ���� �Է��ϼ���: ");
		int input = sc.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (input == num[i]) {
				System.out.println((i + 1) + "��°�� ����");
			}
		}

	}
}
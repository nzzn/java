import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[][] seat = new int[2][5];
		Scanner sc = new Scanner(System.in);

		System.out.println("��ȭ ���� ���α׷� �Դϴ�.");
		System.out.println();

		while (true) {
			int count = 1;
			count = count + 1;
			for (int i = 0; i < seat[0].length; i++) {
				System.out.print("    " + i + "��");
			}
			System.out.println();
			System.out.println("-------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " �� : ");

				for (int j = 0; j < seat[0].length; j++) {

					System.out.print(seat[i][j] + "   ");
				}
				System.out.println();
			}

			System.out.println("-------------------------");
			System.out.print("����� x ���Ŵ� y : ");
			String input = sc.next();
			if (input.equals("x")) {
				System.out.println(count + "�ڸ� ����");
				System.out.println("���� �ý����� �����մϴ�.");
				System.out.println("�ȳ���������.");
				break;
			} else {
				System.out.print("���� �Է��ϼ���: ");
				int row = sc.nextInt();
				System.out.print("���� �Է��ϼ���: ");
				int col = sc.nextInt();

				if (seat[row][col] == 0) {
					seat[row][col] = 1;
					System.out.println("���ŵǾ����ϴ�");
				} else {
					System.out.println("�ٸ� �ڸ��� �����ϼ���");
				}

			}

		}

	}

}

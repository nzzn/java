import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[][] seat = new int[2][5];
		Scanner sc = new Scanner(System.in);

		System.out.println("영화 예매 프로그램 입니다.");
		System.out.println();

		while (true) {
			int count = 1;
			count = count + 1;
			for (int i = 0; i < seat[0].length; i++) {
				System.out.print("    " + i + "열");
			}
			System.out.println();
			System.out.println("-------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " 행 : ");

				for (int j = 0; j < seat[0].length; j++) {

					System.out.print(seat[i][j] + "   ");
				}
				System.out.println();
			}

			System.out.println("-------------------------");
			System.out.print("종료는 x 예매는 y : ");
			String input = sc.next();
			if (input.equals("x")) {
				System.out.println(count + "자리 예매");
				System.out.println("예매 시스템을 종료합니다.");
				System.out.println("안녕히가세요.");
				break;
			} else {
				System.out.print("행을 입력하세요: ");
				int row = sc.nextInt();
				System.out.print("열을 입력하세요: ");
				int col = sc.nextInt();

				if (seat[row][col] == 0) {
					seat[row][col] = 1;
					System.out.println("예매되었습니다");
				} else {
					System.out.println("다른 자리를 선택하세요");
				}

			}

		}

	}

}

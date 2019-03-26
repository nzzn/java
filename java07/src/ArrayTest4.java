
public class ArrayTest4 {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4, 5 }, // 0За
				{ 6, 7, 8, 9, 10 } // 1За
		};
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + "За : ");
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
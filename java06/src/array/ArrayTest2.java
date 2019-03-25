package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] num = new int[5];
			
		num[0] = 1;
		num[2] = 3;
		num[4] = 5;
		
		System.out.println(num.length);			//배열의 개수
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(i + "인덱스 값: " + num[i]);
		}	
		
	}

}

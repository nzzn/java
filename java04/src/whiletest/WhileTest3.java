package whiletest;

public class WhileTest3 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
	
		while (num <= 10) {
			sum = sum + num;
		
			num++;
		}
	
		System.out.println(sum);
	
	}

}

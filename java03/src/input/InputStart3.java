package input;

import java.util.Scanner;
//부품: Scanner - char입력 못받으므로 String 사용

public class InputStart3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("내년에 나의 나이는: " + (age + 1));
		
	}

}

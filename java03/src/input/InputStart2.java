package input;

import java.util.Scanner;
//부품: Scanner - char입력 못받으므로 String 사용

public class InputStart2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나의 정보 입력");
		
		System.out.println("----------");
		
		System.out.print("나이: ");
		String age = sc.next();
		
		System.out.print("성별: ");
		String gender = sc.next();
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("----------");
		
	}

}

package input;

import java.util.Scanner;
//부품: Scanner - char입력 못받으므로 String 사용

public class InputStart4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("당신은 성년이군요.");
		}
		else {
			System.out.println("당신은 미성년이군요.");
		}
		
	}

}

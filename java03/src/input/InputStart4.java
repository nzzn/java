package input;

import java.util.Scanner;
//��ǰ: Scanner - char�Է� �������Ƿ� String ���

public class InputStart4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("����� �����̱���.");
		}
		else {
			System.out.println("����� �̼����̱���.");
		}
		
	}

}

package input;

import java.util.Scanner;
//��ǰ: Scanner - char�Է� �������Ƿ� String ���

public class InputStart3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.println("���⿡ ���� ���̴�: " + (age + 1));
		
	}

}

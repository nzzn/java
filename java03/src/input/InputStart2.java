package input;

import java.util.Scanner;
//��ǰ: Scanner - char�Է� �������Ƿ� String ���

public class InputStart2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է�");
		
		System.out.println("----------");
		
		System.out.print("����: ");
		String age = sc.next();
		
		System.out.print("����: ");
		String gender = sc.next();
		
		System.out.print("�̸�: ");
		String name = sc.next();
		
		System.out.print("----------");
		
	}

}

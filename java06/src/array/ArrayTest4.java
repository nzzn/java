package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� �л��鿡 ���� ������ �Է¹ް� �ͽ��ϴ�.");
		
		String[] name = new String[5];
		int[] s = new int[5];
		
		int sum = 0;
		
		System.out.println("�Է�: �̸� + ����");
		
		for (int i = 0; i < 5; i++) {
			
			name[i] = sc.next();
			
			s[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(name[i] + " : " + s[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			
			sum = sum + s[i];
		}
			
		System.out.println("���: " + sum/5.0);
	}
	
}


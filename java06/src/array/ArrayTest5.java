package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л���: ");
		int student = sc.nextInt();
		int[] english = new int[student];
		int[] math = new int[student];	
		int englishsum = 0;
		int mathsum = 0;
		
		System.out.println(student + "���� �� �л��� ����, ���� �����Դϴ�.");
		
		for (int i = 0; i < student; i++) {
			
			System.out.println("����: ");
			english[i] = sc.nextInt();
			System.out.println("����: ");
			math[i] = sc.nextInt();	
		}
	
		for (int i = 0; i < student; i++) {
			
			englishsum = englishsum + english[i];
			mathsum = mathsum + math[i];
		}
	
		System.out.println("�������� ����: "+ englishsum + " ������� : " + englishsum/student);
		System.out.println("�������� ����: "+ mathsum + " ������� : " + mathsum/student);
			
	}
	
}


package whiletest;

import java.util.Random;
import java.util.Scanner;
//���� ���ߴ� ����

public class WhileTest4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	int target = random.nextInt(100);
	int count = 0;
	
	while (true) {
		count++;
		System.out.print("������ ���ڸ� �Է�: ");
		int input = sc.nextInt();
			
		if (input == target) {
			System.out.println("�����Դϴ�.");
			break;
			}//if
		else{
			System.out.println("�ٽ� �Է��ϼ���.");
			if (input>target) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
				}//if
			else {
				System.out.println("�� ū ���� �Է��ϼ���.");
				}//else
			}//else
		}//while
	System.out.println(count + "������ ����");
	
	}//main

}//class

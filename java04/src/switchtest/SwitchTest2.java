package switchtest;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("������ ������: ");
	String input = sc.next();
	System.out.println("����� �Է°���" + input);
		
		
	switch (input) {
	case "sunny":
		System.out.println("���ڸ� ì�ܰ���.");
		break;
	case "rain":
		System.out.println("����� ì�ܰ���.");
		break;
	default:
		System.out.println("����ũ�� ������");
		break;
	}
		
		
	
		
	}

}

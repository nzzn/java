package input;

import java.util.Scanner;

public class InputStart {

	public static void main(String[] args) {
		
		System.out.println("���� �⺻ ���");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("����� �̸���: " + name);
		
		System.out.print("����� �Ҽ��� �Է��ϼ���.");
		String ss = sc.next();
		System.out.println("����� �̸���: " + ss);
		
	}

}

package switchtest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��ϼ���: ");
		
		String input1 = sc.next();
		
		/*
		int input2 = sc.nextInt();			//string -> int 
		double input3 = sc.nextDouble();	//string -> double
		String input4 = sc.nextLine();		//line -> string
		boolean input5 = sc.nextBoolean();	//string ->boolean
		*/
		
		char c1 = input1.charAt(0);
		
		System.out.println("ù��° ���ڴ�" + c1);
		
		char c2 = input1.charAt(1);
		
		System.out.println("�ι�° ���ڴ�" + c2);
		
		
		
	}

}

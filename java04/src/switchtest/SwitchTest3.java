package switchtest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int month = date.getMonth() +1;
		System.out.println("�̹�����" + month);
		
		switch(month) {
		case 3:case 4:case 5:
			System.out.println("�� �Դϴ�");
			break;
		case 6:case 7:case 8:
			System.out.println("���� �Դϴ�");
			break;
		case 9:case 10:case 11:
			System.out.println("���� �Դϴ�");
			break;
		default:
			System.out.println("�ܿ� �Դϴ�");
		}
		
		switch(month) {
		case 2:
			System.out.println("28��");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("31��");
			break;
			default:
				System.out.println("31��");
		}
		
	}

}

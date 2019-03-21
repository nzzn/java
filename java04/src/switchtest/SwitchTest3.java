package switchtest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int month = date.getMonth() +1;
		System.out.println("이번달은" + month);
		
		switch(month) {
		case 3:case 4:case 5:
			System.out.println("봄 입니다");
			break;
		case 6:case 7:case 8:
			System.out.println("여름 입니다");
			break;
		case 9:case 10:case 11:
			System.out.println("가을 입니다");
			break;
		default:
			System.out.println("겨울 입니다");
		}
		
		switch(month) {
		case 2:
			System.out.println("28일");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("31일");
			break;
			default:
				System.out.println("31일");
		}
		
	}

}

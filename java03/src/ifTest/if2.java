package ifTest;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String food = null;
		int price = 0;
		
		System.out.println("저기요!!!");
		System.out.println("----------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("----------");
		System.out.println( "1)짜장면, 2) 짬뽕, 3) 우동");
		System.out.println("----------");
		
		System.out.print("당신의 선택은  ?");
		int num = sc.nextInt();
		System.out.print("주문 수량은  ?");
		int count = sc.nextInt();
		
		int jajang = 4000;
		int jambong = 5000;
		int udong = 5500;
		
		if (num==1) {
			food = "짜장면";
			price = jajang * count;
		}
		else if (num==2) {
			food = "짬뽕";
			price = jambong * count;
		}
		else if (num==3) {		
			food = "우동";
			price = udong * count;
		}
		System.out.println("당신은 " + food + "을 "+ count + "개 주문하셨습니다");
		System.out.println("당신이 지불할 금액은 " + price + " 원 입니다");
		System.out.println("----------");
		
		if (price >10000) {
			price = price - 2000;
		}
		System.out.println("당신이 지불할 금액은 " + price + " 원 입니다");

		
		
		/*
		if (num==1) {
			System.out.printf("당신은 %s을 주문하셨습니다.\n",a);
		}
		else if (num==2) {
			System.out.println("당신은 짬뽕을 주문하셨습니다.");		
		}
		else if (num==3) {		
			System.out.println("당신은 우동을 주문하셨습니다.");		
		}
	*/
	}

}

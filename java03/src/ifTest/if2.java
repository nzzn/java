package ifTest;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String food = null;
		int price = 0;
		
		System.out.println("�����!!!");
		System.out.println("----------");
		System.out.println("�޴��� ������.");
		System.out.println("----------");
		System.out.println( "1)¥���, 2) «��, 3) �쵿");
		System.out.println("----------");
		
		System.out.print("����� ������  ?");
		int num = sc.nextInt();
		System.out.print("�ֹ� ������  ?");
		int count = sc.nextInt();
		
		int jajang = 4000;
		int jambong = 5000;
		int udong = 5500;
		
		if (num==1) {
			food = "¥���";
			price = jajang * count;
		}
		else if (num==2) {
			food = "«��";
			price = jambong * count;
		}
		else if (num==3) {		
			food = "�쵿";
			price = udong * count;
		}
		System.out.println("����� " + food + "�� "+ count + "�� �ֹ��ϼ̽��ϴ�");
		System.out.println("����� ������ �ݾ��� " + price + " �� �Դϴ�");
		System.out.println("----------");
		
		if (price >10000) {
			price = price - 2000;
		}
		System.out.println("����� ������ �ݾ��� " + price + " �� �Դϴ�");

		
		
		/*
		if (num==1) {
			System.out.printf("����� %s�� �ֹ��ϼ̽��ϴ�.\n",a);
		}
		else if (num==2) {
			System.out.println("����� «���� �ֹ��ϼ̽��ϴ�.");		
		}
		else if (num==3) {		
			System.out.println("����� �쵿�� �ֹ��ϼ̽��ϴ�.");		
		}
	*/
	}

}

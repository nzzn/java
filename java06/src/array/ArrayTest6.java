package array;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		//���� ���� �ý���
		
		int end = 0;
		int[] seat = new int[10];
		int count = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------");
		
		for (int i = 0; i < seat.length; i++) {
			
			System.out.print(seat[i] + "  ");	
		}
		System.out.println();

		for (int i = 0; i < seat.length; i++) {
			
			System.out.print((i+1) + "  ");
		}
		System.out.println();
		System.out.println("------------------------------");
		
		while (true) {	
			
			System.out.println("������ �¼���ȣ�� �Է�(����:0)");
			
			int input = sc.nextInt();
			System.out.println("��� ���� �¼���ȣ: " + input);
			if (input==0) {
				System.out.println(count+"�� "+count*7000 +"��~");
				break;	
			}
			else {
				if (seat[input-1]==0){
					System.out.println("���ſϷ�");
					System.out.println("------------------------------");
					seat[input-1]=1;
					count++;
					for (int i = 0; i < seat.length; i++) {
						System.out.print(seat[i] + "  ");	
					}
					System.out.println();

					for (int i = 0; i < seat.length; i++) {
					
						System.out.print((i+1) + "  ");
					}	
					System.out.println();
					System.out.println("------------------------------");
					}
				else {
					System.out.println("�ٸ� �ڸ��� ������ �ּ���");

				}
	
			}
			
		}
				
	}
	
}


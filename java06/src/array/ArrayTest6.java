package array;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		//극장 예매 시스템
		
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
			
			System.out.println("예매할 좌석번호를 입력(종료:0)");
			
			int input = sc.nextInt();
			System.out.println("희망 예매 좌석번호: " + input);
			if (input==0) {
				System.out.println(count+"명 "+count*7000 +"원~");
				break;	
			}
			else {
				if (seat[input-1]==0){
					System.out.println("예매완료");
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
					System.out.println("다른 자리를 선택해 주세요");

				}
	
			}
			
		}
				
	}
	
}


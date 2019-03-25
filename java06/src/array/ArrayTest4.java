package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 학생들에 대한 성적을 입력받고 싶습니다.");
		
		String[] name = new String[5];
		int[] s = new int[5];
		
		int sum = 0;
		
		System.out.println("입력: 이름 + 점수");
		
		for (int i = 0; i < 5; i++) {
			
			name[i] = sc.next();
			
			s[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(name[i] + " : " + s[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			
			sum = sum + s[i];
		}
			
		System.out.println("평균: " + sum/5.0);
	}
	
}


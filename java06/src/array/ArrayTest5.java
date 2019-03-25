package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수: ");
		int student = sc.nextInt();
		int[] english = new int[student];
		int[] math = new int[student];	
		int englishsum = 0;
		int mathsum = 0;
		
		System.out.println(student + "명의 각 학생의 영어, 수학 점수입니다.");
		
		for (int i = 0; i < student; i++) {
			
			System.out.println("영어: ");
			english[i] = sc.nextInt();
			System.out.println("수학: ");
			math[i] = sc.nextInt();	
		}
	
		for (int i = 0; i < student; i++) {
			
			englishsum = englishsum + english[i];
			mathsum = mathsum + math[i];
		}
	
		System.out.println("영어점수 총합: "+ englishsum + " 영어평균 : " + englishsum/student);
		System.out.println("수학점수 총합: "+ mathsum + " 수학평균 : " + mathsum/student);
			
	}
	
}


package whiletest;

import java.util.Random;
import java.util.Scanner;
//숫자 맞추는 게임

public class WhileTest4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	int target = random.nextInt(100);
	int count = 0;
	
	while (true) {
		count++;
		System.out.print("생각한 숫자를 입력: ");
		int input = sc.nextInt();
			
		if (input == target) {
			System.out.println("정답입니다.");
			break;
			}//if
		else{
			System.out.println("다시 입력하세요.");
			if (input>target) {
				System.out.println("더 작은 수를 입력하세요.");
				}//if
			else {
				System.out.println("더 큰 수를 입력하세요.");
				}//else
			}//else
		}//while
	System.out.println(count + "번만에 맞춤");
	
	}//main

}//class

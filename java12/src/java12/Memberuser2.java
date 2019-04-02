package java12;

import java.util.Scanner;

public class Memberuser2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원가입정보");
		System.out.println("---------------");
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pw : ");
		String pw = sc.next();
		System.out.println("name : ");
		String name = sc.next();
		System.out.println("tel : ");
		String tel = sc.next();

		Member member1 = new Member(id, pw, name, tel);

		System.out.println(member1);

		DbProcess db = new DbProcess();
		db.insert(member1);

	}
}
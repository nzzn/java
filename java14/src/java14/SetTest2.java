package java14;

import java.util.HashSet;

public class SetTest2 {

	public static void main(String[] args) {

		HashSet team = new HashSet();
		
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB 관리");

		System.out.println(team);
	}

}

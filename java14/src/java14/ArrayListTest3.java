package java14;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");

		list.remove(1);
		System.out.println(list);
	}
}

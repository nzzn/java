package java14;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");

		System.out.println(list.get(0));
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list);

	}

}

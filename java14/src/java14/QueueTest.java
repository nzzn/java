package java14;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();

		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("내일 먹을 우유");

		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();

	}

}

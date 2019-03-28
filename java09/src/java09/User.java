package java09;

public class User {

	public static void main(String[] args) {

		cal cal = new cal();
		String result = cal.call();

		System.out.println(result);
		System.out.println(cal.call());

		int add = cal.add(11, 22);
		System.out.println(add);
		System.out.println(cal.add(11, 22));

	}

}

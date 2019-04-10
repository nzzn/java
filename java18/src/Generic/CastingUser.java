package Generic;

public class CastingUser {

	public static void main(String[] args) {

		Casting1 c1 = new Casting1(100, 300);

		System.out.println(c1.x);
		System.out.println(c1.y);

		int xx = (int) c1.x; // 강제 형변환
		int yy = (int) c1.y; // 강제 형변환

		System.out.println(xx + yy);

		Casting1 c2 = new Casting1("감자", "고구마");

		System.out.println(c2.x);
		System.out.println(c2.y);

		String xx2 = (String) c2.x;
		String yy2 = (String) c2.y;
		System.out.println(xx2 + yy2);

	}

}

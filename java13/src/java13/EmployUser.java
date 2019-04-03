package java13;

public class EmployUser {

	public static void main(String[] args) {

		Employ e1 = new Employ("임아무개",24,"남");
		Employ e2 = new Employ("김아무개",23,"여");
		Employ e3 = new Employ("박아무개",25,"남");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.println("-----------------------------------");
		System.out.println("전체 직원 수 : " + Employ.count);
		System.out.println("직원의 평균 나이 : " + Employ.ageavg());
	}

}

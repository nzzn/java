package java15;

public class Manager extends Employee {

	public static void main(String[] args) {

		Employee e = new Employee();

		int bonus;

		e.name = "이름은";
		e.adress = "주소는";
		e.salary = 500;
		e.rrn = 12345;

		bonus = 1000;

		System.out.println(e);
		System.out.println(bonus);
	}
}

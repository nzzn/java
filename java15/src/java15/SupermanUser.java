package java15;

public class SupermanUser {

	public static void main(String[] args) {

		SuperMan sman = new SuperMan();
		sman.fly = true;
		sman.power = "강";
		sman.name = "클라크";
		
		sman.eat();
		sman.run();
		sman.flyHigh();
		System.out.println(sman);
		
	}

}

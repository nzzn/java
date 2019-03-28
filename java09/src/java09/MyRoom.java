package java09;

public class MyRoom {

	public static void main(String[] args) {
		// tv
		Tv tv = new Tv();
		tv.shape = "네모";
		tv.size = 20;
		System.out.println("모양은: " + tv.shape + "  사이즈는: " + tv.size);

		tv.on();
		tv.change();
		tv.off();
		// 매서드 호출, 매서드를 호출하면 원본안의 내용이 호출됨

		System.out.println("--------------------");

		Tv tv2 = new Tv();
		tv2.shape = "동글";
		tv2.size = 100;
		System.out.println("모양은: " + tv2.shape + "  사이즈는: " + tv2.size);

		tv2.on();
		tv2.change();
		tv2.off();
		System.out.println("--------------------");

		// dog
		Dog dog = new Dog();
		dog.color = "노랑색";
		dog.tail = 10;
		System.out.println(dog.color + " " + dog.tail);

		dog.bark();
		dog.shake();
		System.out.println("--------------------");

		// phone
		Phone phone = new Phone();
		phone.number = "010123456789";
		phone.name = "galaxy";
		System.out.println(phone.number + "  " + phone.name);
		phone.on();
		phone.Ring();

	}

}

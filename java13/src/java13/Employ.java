package java13;

import java.security.PublicKey;

public class Employ {

	String name;
	int age;
	String gen;
	static int count;
	static int agetotal;

	public Employ(String name, int age, String gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		count++;
		agetotal = agetotal + age;
	}

	public static float ageavg() {

		float ageavg = agetotal / ((float)count);
		return ageavg;

	}

	@Override
	public String toString() {
		return "Employ [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	

}

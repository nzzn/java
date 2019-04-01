package Construct;

public class tv {

	String color;
	int size;
	String shape;

	// 기본 생성자
	public tv() {
	}

	public tv(String c, int s, String sh) {
		color = c;
		size = s;
		shape = sh;
	}

	public void powerOn() {
		System.out.println("전원을 켜다");
	}

	public void powerOff() {
		System.out.println("전원을 끄다");
	}

	@Override
	public String toString() {
		return "tv [color=" + color + ", size=" + size + ", shape=" + shape + "]";
	}

}

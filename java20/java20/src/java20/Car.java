package java20;

public class Car extends Object{
	
	int speed;
	String color;

	public Car() {
		
	}
	public Car(int speed, String color) {
		super();			//기본값.지워도됨.Object()
							//부모 클래스의 기본 생성자를 의미
		this.speed = speed;		
		this.color = color;
	}
	
	@Override
	public String toString() {
		return speed + "," + color;
	}

	
}

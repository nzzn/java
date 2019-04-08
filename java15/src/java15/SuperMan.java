package java15;

public class SuperMan extends Man{

	//변수 3, 메소드 3
	
	boolean fly;
	
	public void flyHigh() {
		
		System.out.println("높게날다");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}

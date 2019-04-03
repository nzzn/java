package java13;

public class Day {

	String doing;
	int time;static int timetotal; 
	String location;
	static int count;
	
	public Day(String doing, int time, String location) {

		this.doing = doing;
		this.time = time;
		this.location = location;
		count ++;
		timetotal = timetotal + time; 
		
	}
	
	public static float timeavg() {			//static 메솓는 static 변수 쑬 수 있다!!!
		
		float timeavg = timetotal/((float)count);
		return timeavg;
		
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}

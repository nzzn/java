package ifTest;

import java.util.Date;

public class if01 {

	public static void main(String[] args) {
		//지금 시각은 오전일까 오후일까 저녁일까 판단
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if (hour < 12 ) {		
			System.out.println("오전이군요!");
		}
		
		else if(hour< 17) {
			System.out.println("오후이군요!");
		}
		
		else {
		System.out.println("밤이군요!");
		}
		
	}

}

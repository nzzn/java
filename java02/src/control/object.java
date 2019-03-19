package control;

import java.lang.*;
import java.util.Date;


public class object {

	public static void main(String[] args) {
	
		Date date = new Date ();
		
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		
		int year =date.getYear() +1900 ;
		int month = date.getMonth() + 1 ;
		int day =date.getDate();	
		
		System.out.println("현재 시각은 " + hour+"시"+minute+"분"+second+"초");
		System.out.println("오늘 날짜는" + year+"년" + month +"월"+ day+ "일");
		
		System.out.println(date.getDay());
		
		
		
	}

}


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
		
		System.out.println("���� �ð��� " + hour+"��"+minute+"��"+second+"��");
		System.out.println("���� ��¥��" + year+"��" + month +"��"+ day+ "��");
		
		System.out.println(date.getDay());
		
		
		
	}

}


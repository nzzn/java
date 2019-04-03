package java13;

public class DayUser {

	public static void main(String[] args) {

		System.out.println(Day.count); // static은 객체생성 전에 접근 가능 그래서 main앞에 static

		System.out.println(Day.timetotal);

		Day day1 = new Day("자바공부", 10, "강남"); // static은 클래스당 하나여서 클래스 이름을 쓰는것이 일반적
		System.out.println(day1);
		System.out.println(Day.count);
		System.out.println(Day.timetotal);

		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println(Day.timetotal);

		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println(Day.timetotal);

		System.out.println("-----------------------------");
		System.out.println("평균 : " + Day.timetotal / Day.count);
		System.out.println("평균 : " + Day.timeavg());
		System.out.println("-----------------------------");

		Day day4 = new Day("운동", 11, "피트니스");
		Day day5 = new Day("운동", 11, "피트니스");
		Day day6 = new Day("운동", 11, "피트니스");
		Day day7 = new Day("운동", 11, "피트니스");

		System.out.println("날짜수 : " + Day.count);

		System.out.println("총시간 : " + Day.timetotal);

		System.out.println("평균 : " + Day.timeavg());
	}

}

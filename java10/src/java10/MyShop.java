package java10;

public class MyShop {

	public static void main(String[] args) {

		int milk = 2000;
		int coffee = 4000;
		int icecream = 3000;
		int bread = 5000;

		Cal cal = new Cal();

		// 우유1, 커피1
		int total = cal.add(milk, coffee);
		System.out.println("전체 지불 금액 : " + total + "원");
		System.out.println("할인 후 지불 금액 :  " + (total - 1000) + "원");
		System.out.println("감사합니다. 다음에 도 들러주세요");
		System.out.println("--------------------");

		// 빵2, 아이스크림 3
		total = cal.add(cal.mul(bread, 2), cal.mul(icecream, 3));
		System.out.println("전체 지불 금액 : " + total + "원");
		System.out.println("감사합니다. 다음에 도 들러주세요");
		System.out.println("--------------------");

		// 더치페이
		total = cal.div(total, 5);
		System.out.println("전체 지불 금액 : " + total + "원");
		System.out.println("감사합니다. 다음에 도 들러주세요");
		System.out.println("--------------------");

		cal.welcome("park");
		cal.point("park", 1000);

	}

}

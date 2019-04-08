package Bank;

public class BankUser {

	public static void main(String[] args) {

		GoodBank good = new GoodBank();
		BadBank bad = new BadBank();

		good.Interest();
		good.goodinterest();

		System.out.println("");

		bad.Interest();
		bad.badinterest();

	}

}

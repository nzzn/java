package Student;

public class StuUser {

	public static void main(String[] args) {

		Elementary el = new Elementary();
		Middle mi = new Middle();
		Univ un = new Univ();

		el.stu();
		el.elstu();

		mi.stu();
		mi.midstu();

		un.stu();
		un.univstu();

	}

}

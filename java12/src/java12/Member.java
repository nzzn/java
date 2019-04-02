package java12;

public class Member {

	String id;
	String pw;
	String name;
	String tel;
	int bitth;

	public Member() {

		// 기본 생성자

	}

	public Member(String id, String pw, String name, String tel) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

}

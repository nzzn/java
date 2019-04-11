package java19;

//java.sql.클래스들
//import java.sql.폴더.클래스들		=>java.sql.폴더.클래스들
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DB연결테스트 {

	public static void main(String[] args) throws Exception  {
		Scanner sc = new Scanner(System.in);
		System.out.print("id입력: ");
		String id = sc.next();
		System.out.print("title입력: ");
		String title = sc.next();
		System.out.print("director입력: ");
		String director = sc.next();
		System.out.print("contents입력: ");
		String contents = sc.next();
		System.out.print("이미지입력: ");
		String img = sc.next();

		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";

		// 1. 커넥터(드라이버) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터(드라이버) 설정 성공");

		// 2. DB연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");

		// 3. SQL문 객체화
		// String sql = "insert into movie values
		// ("+id+","+title+","+director+","+contents+","+img+")";
		String sql = "insert into movie values (?,?,?,?,?)"; // ps밑에
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, director);
		ps.setString(4, contents);
		ps.setString(5, img);

		System.out.println("sql문 객체화 성공");

		// 4. SQL문 전송
		ps.executeUpdate();
		System.out.println("sql문 전송 성공");

	}

}

package java12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnect {

	public static void main(String[] args) throws Exception {
		// JDBC 프로그래밍 순서

		// 1. connector 설정
		// 외부자원 연결 => 에러처리
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("커넥터 연결 성공");

		// 2. 인증(id,pw)받으면 DB 연결
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("db인증 및 연결 성공");

		// 3. SQL문 결정, SQL문 객체화
		String sql = "insert into member values ('win','win','win','win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("SQL문 객체화 성공");

		// 4. SQL문 connector 통해서 전달
		ps.executeUpdate();
		System.out.println("성공");
	}

}

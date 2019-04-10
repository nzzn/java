package java17;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {

		// 1. 클라이언트로부터의 요청만을 담당하는 서버솤켓 생성
		ServerSocket server = new ServerSocket(5000);
		System.out.println("  시작  ");

		// 2. 서버소켓이 연결을 승인하면
		System.out.println("  연결  ");

		// 3. 서버에 클라이언트가 연결이 생성
		System.out.println("  완료  ");

		// 4. 데이터 전송, 데이터 보내고 데이터 받음
		System.out.println("  시작  ");

		while (true) {
			Socket socket = server.accept();
			System.out.println("  서버 소켓이 생성됨  ");
		}

	}

}
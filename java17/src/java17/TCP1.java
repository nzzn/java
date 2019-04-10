package java17;

import java.io.IOException;
import java.net.Socket;

public class TCP1 {

	public static void main(String[] args) throws Exception, IOException {

		Socket socket = new Socket("localhost", 9100);
		System.out.println("  클라이언트1 소켓 생성 됨  ");

	}

}

package java17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class UDPServer {

	public static void main(String[] args) throws Exception {

		// 1. UDP 방식의 socket 필요
		DatagramSocket socket = new DatagramSocket();
		String data = "Java Programmer";
		byte[] data2 = data.getBytes();

		InetAddress ip = InetAddress.getByName("127.0.0.1");

		// 2. UDP 방식의 패킷 필요
		DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
		socket.send(packet);
		System.out.println("클라이언트에게 정보 전송 완료");

	}

}

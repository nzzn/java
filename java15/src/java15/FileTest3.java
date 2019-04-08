package java15;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileTest3 {

	public static void main(String[] args) throws IOException {

		// 파일에 객체 생성
		// 파일에 write

		String day = JOptionPane.showInputDialog("작성 날짜 입력");
		String title = JOptionPane.showInputDialog("제목");
		String content = JOptionPane.showInputDialog("내용");
		String etc = JOptionPane.showInputDialog("기타");

		FileWriter file = new FileWriter("c:/temp2/t3/" + day + ".txt");

		file.write("날짜 : " + day + "\r\n");
		file.write("제목 : " + title + "\r\n");
		file.write("내용 : " + content + "\r\n");
		file.write("기타 : " + etc + "\r\n");
		file.close();

	}

}

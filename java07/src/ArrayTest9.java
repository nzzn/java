import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest9 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("나의 그림2"); // frame - 제목지정

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		ImageIcon icon = new ImageIcon("ham.jpg");

		JButton button = new JButton();
		button.setIcon(icon);

		f.add(button);
		f.setSize(600, 500); // frame - 크기기정
		f.setVisible(true); // frame - 보여주기
	}
}
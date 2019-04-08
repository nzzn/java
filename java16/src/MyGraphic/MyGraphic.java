package MyGraphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyGraphic extends JFrame {

	public MyGraphic() {

		setSize(300, 300);
		setTitle("나의 전화기들");

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("나를 눌러요");

		add(t1); // 자동형변환 (업캐스팅)
		add(b1); // 자동형변환 (업캐스팅)

		setVisible(true);

	}

	public static void main(String[] args) {

		MyGraphic g = new MyGraphic();

	}

}

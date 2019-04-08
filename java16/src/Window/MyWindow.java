package Window;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		setSize(300, 300);
		setTitle("내 마음대로 부모 메서드 호출 가능");
		setVisible(true);

	}

	public static void main(String[] args) {

		MyWindow my = new MyWindow();

	}

}

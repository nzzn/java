package java19;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener; //인터페이스
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyWindow extends JFrame implements ActionListener {
	JButton b1, b2;

	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(500, 500);

		getContentPane().setLayout(new FlowLayout());

		b1 = new JButton("버튼");
		b1.setForeground(Color.RED);
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 99));
		getContentPane().add(b1);
		b1.addActionListener(this);

		b2 = new JButton("버튼");
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 99));
		getContentPane().add(b2);
		b2.addActionListener(this);

		JButton button = new JButton("버튼");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 인터페이스로 객체생성x 익명클래스
				System.out.println("나야나");
			}
		});
		button.setForeground(Color.GREEN);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 99));
		getContentPane().add(button);

		JButton button_1 = new JButton("버튼");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("마지막~~~~");
			}
		});
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 99));
		getContentPane().add(button_1);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyWindow window = new MyWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("빨간버튼");

		}
		if (e.getSource() == b2) {
			System.out.println("2번버튼");

		}

	}

}

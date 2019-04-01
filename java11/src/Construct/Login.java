package Construct;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	static String OriId = "root";
	static String OriPw = "1234";

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 생성자 프레임");
		f.setBackground(Color.WHITE);
		f.setSize(420, 440);

		// 레이아웃 변경 : FlowLayout
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		// 레이블 생성-> 프레임에 add
		JLabel label = new JLabel();
		f.getContentPane().add(label);

		// 이미지 생성-> 레이블에 add
		ImageIcon icon = new ImageIcon("d.jpg");
		label.setIcon(icon);

		// id/ pw생성 -> 프레임에 add
		JLabel id = new JLabel("id 입력");
		JLabel pw = new JLabel("pw 입력");
		JTextField idtext = new JTextField(10);
		JTextField pwtext = new JTextField(10);
		f.getContentPane().add(id);
		f.getContentPane().add(idtext);
		f.getContentPane().add(pw);
		f.getContentPane().add(pwtext);

		// 버튼생성 -> 프레임에 add
		JButton button = new JButton("로그인");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String inputId = idtext.getText();
				String inputPw = pwtext.getText();

				if (inputId.equals(OriId) && (inputPw.equals(OriPw))) {
					System.out.println("로그인 ok");
					// f.setVisible(false);
					Diary d = new Diary();
				} else {
					System.out.println("로그인 not");
				}
			}
		});
		f.getContentPane().add(button);
		f.setVisible(true);

	}
}

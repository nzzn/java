package java08;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.print.attribute.IntegerSyntax;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CalWindow {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField result;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setTitle("나의 계산기");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\cal.png.jpg"));

		f.setSize(287, 410);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("숫자 1 :\r\n");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		label.setBackground(Color.WHITE);
		f.getContentPane().add(label);

		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(n1);
		n1.setColumns(10);

		JLabel label_1 = new JLabel("숫자 2 :\r\n");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBackground(Color.WHITE);
		f.getContentPane().add(label_1);

		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.BOLD, 20));
		n2.setColumns(10);
		f.getContentPane().add(n2);

		JButton btnNewButton = new JButton("더하기 연산\r\n");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("더하기 버튼을 누르셨군요");
				String num1 = n1.getText();
				String num2 = n2.getText();
				System.out.println("숫자1 : " + num1 + " 숫자2: " + num2);
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 + n22;
				System.out.println("두 수를 더한 값은 : " + sum);
				result.setText(sum + " ");
			}
		});
		f.getContentPane().add(btnNewButton);

		JButton sub = new JButton("빼기 연산");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sub = n11 - n22;
				result.setText(sub + " ");
			}
		});
		sub.setBackground(Color.GREEN);
		sub.setForeground(Color.RED);
		sub.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(sub);

		result = new JTextField();
		result.setForeground(Color.WHITE);
		result.setBackground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 25));
		f.getContentPane().add(result);
		result.setColumns(10);
		
		JButton ham = new JButton("");
		ham.setForeground(Color.BLACK);
		ham.setBackground(Color.ORANGE);
		ham.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\햄2.png"));
		f.getContentPane().add(ham);

		f.setVisible(true);

	}

}

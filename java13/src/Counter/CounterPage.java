package Counter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterPage {

	static int count;

	public static void main(String[] args) {

		JFrame f = new JFrame("-- 카운터 --");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(300, 300);

		JLabel number = new JLabel("0");
		Font font = new Font("궁서", Font.BOLD, 150);
		number.setFont(font);
		number.setForeground(Color.red);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + " ");
			}
		});
		b1.setBackground(Color.green);
		b1.setForeground(Color.magenta);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + " ");
			}
		});
		b2.setBackground(Color.blue);
		b2.setForeground(Color.magenta);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("1빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + " ");
			}
		});
		b3.setBackground(Color.green);
		b3.setForeground(Color.magenta);
		f.getContentPane().add(b3);

		f.getContentPane().add(number);
		f.setVisible(true);
	}

}

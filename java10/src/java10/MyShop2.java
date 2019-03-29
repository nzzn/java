package java10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyShop2 {
	private static JTextField count;
	private static JTextField total;

	static int number = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();

		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\중국집.jpg"));
		f.getContentPane().add(img);

		f.getContentPane().setBackground(Color.RED);
		f.setTitle("나의 주문 프로그램");
		f.setSize(500, 700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton jjajang = new JButton("짜장");
		jjajang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장.jpg");
				img.setIcon(icon);
				number++;
				count.setText(number + " ");
				total.setText(number * 5000 + " ");
			}
		});

		jjajang.setFont(new Font("궁서", Font.PLAIN, 18));
		jjajang.setBackground(Color.YELLOW);
		f.getContentPane().add(jjajang);

		JButton udon = new JButton("우동");
		udon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.jpg");
				img.setIcon(icon);
				number++;
				count.setText(number + " ");
				total.setText(number * 5000 + " ");
			}
		});
		udon.setFont(new Font("궁서", Font.PLAIN, 18));
		udon.setBackground(Color.YELLOW);
		f.getContentPane().add(udon);

		JButton jjambbong = new JButton("짬뽕");
		jjambbong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				img.setIcon(icon);
				number++;
				count.setText(number + " ");
				total.setText(number * 5000 + " ");

			}
		});
		jjambbong.setFont(new Font("궁서", Font.PLAIN, 18));
		jjambbong.setBackground(Color.YELLOW);
		f.getContentPane().add(jjambbong);

		JLabel aaa = new JLabel("개수");
		aaa.setForeground(Color.YELLOW);
		aaa.setBackground(Color.WHITE);
		aaa.setFont(new Font("궁서", Font.BOLD, 15));
		f.getContentPane().add(aaa);

		count = new JTextField();
		f.getContentPane().add(count);
		count.setColumns(5);

		JLabel aa = new JLabel("금액");
		aa.setForeground(Color.YELLOW);
		aa.setBackground(Color.WHITE);
		aa.setFont(new Font("궁서", Font.BOLD, 15));
		f.getContentPane().add(aa);

		total = new JTextField();
		f.getContentPane().add(total);
		total.setColumns(10);

		f.setVisible(true);
	}

}

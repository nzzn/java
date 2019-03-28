package java09;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MyMovie {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setTitle("나의 영화 앨범");
		f.setSize(500, 700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel poster = new JLabel("");
		poster.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\genius.jpg"));
		f.getContentPane().add(poster);

		JButton genius = new JButton("Genius");
		genius.setBackground(Color.CYAN);
		genius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon icong = new ImageIcon("genius.jpg");
				poster.setIcon(icong);

			}
		});
		genius.setFont(new Font("Impact", Font.BOLD, 25));
		f.getContentPane().add(genius);

		JButton her = new JButton("Her");
		her.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 포스터 이미지를 포스터 라벨에 아이콘으로 집어넣는다.
				ImageIcon iconher = new ImageIcon("her.jpg");
				poster.setIcon(iconher);
			}
		});
		her.setBackground(Color.CYAN);
		her.setFont(new Font("Impact", Font.BOLD, 25));
		f.getContentPane().add(her);

		JButton Star = new JButton("star");
		Star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon iconstar = new ImageIcon("startreck.jpg");
				poster.setIcon(iconstar);
			}
		});
		Star.setBackground(Color.CYAN);
		Star.setFont(new Font("Impact", Font.BOLD, 25));
		f.getContentPane().add(Star);

		f.setVisible(true);
	}

}

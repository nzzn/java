package Construct;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private JTextField date;
	private JTextField title;

	public Diary() {
		JFrame f = new JFrame("일기쓰는 프레임");
		f.getContentPane().setBackground(Color.PINK);
		f.setBackground(Color.WHITE);
		f.setSize(564, 590);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("----- 일기 작성 날짜 -----\r\n");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel);

		date = new JTextField();
		date.setBackground(Color.WHITE);
		date.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(date);
		date.setColumns(10);

		JLabel label = new JLabel("----- 일기 작성 제목 -----");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(label);

		title = new JTextField();
		title.setBackground(Color.WHITE);
		title.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(title);
		title.setColumns(10);

		JLabel label_1 = new JLabel("----- 일기 내용 -----");
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(label_1);

		JTextArea content = new JTextArea();
		content.setFont(new Font("Monospaced", Font.BOLD, 18));
		content.setBackground(Color.WHITE);
		content.setColumns(40);
		content.setRows(13);
		f.getContentPane().add(content);

		JButton btnNewButton = new JButton("파일에 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getdate = date.getText();
				String gettitle = title.getText();
				String getcontent = content.getText();
				System.out.println(getdate + gettitle + getcontent);

				try {
					FileWriter file = new FileWriter(getdate + ".txt");
					file.write(getdate + "\n");
					file.write(gettitle + "\n");
					file.write(getcontent + "\n");
					file.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("파일에서 읽어오기\r\n");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}

}

package java08;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWindow {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("나의 메뉴판\r\n");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\햄2.png"));
		f.setBackground(Color.PINK);
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("나를 눌러요");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼을 눌렀군요");
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		button.setToolTipText("내가 보이나요");
		f.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("햄버거 버튼을 눌렀군요");
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\햄2.png"));
		f.getContentPane().add(btnNewButton);
		f.setSize(301,319);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}

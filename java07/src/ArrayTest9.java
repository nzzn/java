import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest9 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("���� �׸�2"); // frame - ��������

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		ImageIcon icon = new ImageIcon("ham.jpg");

		JButton button = new JButton();
		button.setIcon(icon);

		f.add(button);
		f.setSize(600, 500); // frame - ũ�����
		f.setVisible(true); // frame - �����ֱ�
	}
}
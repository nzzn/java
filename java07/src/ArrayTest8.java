import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("���� �׸�"); // frame - ��������

		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("ham.jpg");
		l.setIcon(icon);

		f.add(l);
		f.setSize(600, 500); // frame - ũ�����
		f.setVisible(true); // frame - �����ֱ�
	}
}
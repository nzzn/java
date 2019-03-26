import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("나의 그림"); // frame - 제목지정

		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("ham.jpg");
		l.setIcon(icon);

		f.add(l);
		f.setSize(600, 500); // frame - 크기기정
		f.setVisible(true); // frame - 보여주기
	}
}
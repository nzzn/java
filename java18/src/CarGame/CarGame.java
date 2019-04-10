package CarGame;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread {
		int x, y; // x축,y축
		ImageIcon icon;
		JLabel label; // 자동차가 올려질 자리

		public CarThread(String name, int x, int y) {
			// 이미지아이콘, 레이블, 프레임...
			System.out.println(name + "자동차 스레드 생성");
			this.x = x;
			this.y = y;
			icon = new ImageIcon(name);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);

		}

		public void run() {
			System.out.println("자동차가 달립니다"); // 자동차가 달리는 코드
			Random random = new Random(); // 랜덤발생 + x측 구해줌
			for (int i = 0; i < 100; i++) {
				x = x + random.nextInt(10);
				System.out.println("x축 값 : " + x);
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}

			}

		}
	}

	public CarGame() {
		setSize(600, 300);
		setTitle("자동차 경주 게임");

		CarThread car1 = new CarThread("car1.gif", 50, 50);
		CarThread car2 = new CarThread("car2.gif", 50, 100);
		CarThread car3 = new CarThread("car3.gif", 50, 150);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame car = new CarGame();

	}
}

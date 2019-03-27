package java08;

import java.util.Random;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class RockGame {
	private static JTextField intro;
	private static JTextField result;
	static int s = 0;
	static int r = 1;
	static int p = 2;
	static int win = 0;
	static int lose = 0;
	static int draw = 0;
	static int count = 0;

	public static void main(String[] args) {
		Random random = new Random();
		JFrame f = new JFrame();

		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\가위.png"));
		f.setTitle("나의 가위바위보 게임");

		f.setSize(800, 500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));

		intro = new JTextField();
		intro.setBackground(Color.ORANGE);
		intro.setFont(new Font("궁서", Font.PLAIN, 22));
		intro.setText("가위 바위 보 게임을 시작합니다.\r\n원하는 버튼을 눌러주세요.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);

		result = new JTextField();
		result.setBackground(Color.ORANGE);
		result.setFont(new Font("궁서", Font.PLAIN, 22));
		result.setText("아직 게임 시작 전 입니다.");
		f.getContentPane().add(result, BorderLayout.SOUTH);
		result.setColumns(10);

		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton ro = new JButton("");
		ro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위바위보 게임 (총 게임 횟수: " + count + "회 )");
				System.out.println("주먹을 선택하셨군요");
				int me = r; // 나주먹냄
				int computer = random.nextInt(2);
				// 컴퓨터가 가위냈을때
				if (computer == s) {
					result.setText("승리");
					win = win + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 바위 냈을때
				else if (computer == me) {
					result.setText("무승부");
					draw = draw + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 보 냈을때
				else {
					result.setText("패배");
					lose = lose + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
			}
		});
		ro.setBackground(Color.RED);
		ro.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\주먹.png"));
		panel.add(ro);

		JButton se = new JButton("");
		se.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위바위보 게임 (총 게임 횟수: " + count + "회 )");
				System.out.println("가위를 선택하셨군요");
				int me = s; // 나가위냄
				int computer = random.nextInt(2);
				// 컴퓨터가 가위냈을때
				if (computer == me) {
					result.setText("무승부");
					draw = draw + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 바위 냈을때
				else if (computer == r) {
					result.setText("패배");
					lose = lose + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 보 냈을때
				else {
					result.setText("승리");
					win = win + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
			}
		});
		se.setBackground(Color.GREEN);
		se.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\가위.png"));
		panel.add(se);

		JButton pa = new JButton("");
		pa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위바위보 게임 (총 게임 횟수: " + count + "회 )");
				System.out.println("보를 선택하셨군요");
				int me = p; // 나보냄
				int computer = random.nextInt(2);
				// 컴퓨터가 보냈을때
				if (computer == me) {
					result.setText("무승부");
					draw = draw + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 바위 냈을때
				else if (computer == r) {
					result.setText("승리");
					win = win + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
				// 컴퓨터가 가위 냈을때
				else {
					result.setText("패배");
					lose = lose + 1;
					intro.setText(win + "승" + lose + "패 " + draw + "무");
				}
			}
		});
		pa.setBackground(Color.BLUE);
		pa.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\보.png"));
		panel.add(pa);

		f.setVisible(true);
	}
}

package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력: ");
		System.out.println("당신이 입력한 이름은: " + name);
		
		String age = JOptionPane.showInputDialog("당신의 나이를 입력: ");
		System.out.println("당신이 입력한 나이는: " + age);
		
		String comp = JOptionPane.showInputDialog("당신의 소속을 입력: ");
		System.out.println("당신이 입력한 소속은: " + comp);
		
	}

}

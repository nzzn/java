package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("����� �̸��� �Է�: ");
		System.out.println("����� �Է��� �̸���: " + name);
		
		String age = JOptionPane.showInputDialog("����� ���̸� �Է�: ");
		System.out.println("����� �Է��� ���̴�: " + age);
		
		String comp = JOptionPane.showInputDialog("����� �Ҽ��� �Է�: ");
		System.out.println("����� �Է��� �Ҽ���: " + comp);
		
	}

}

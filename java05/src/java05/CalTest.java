package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("숫자 1 입력");
		String num2 = JOptionPane.showInputDialog("숫자 2 입력");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, n1 + n2);
		
		int result = JOptionPane.showConfirmDialog(null, n1 + n2);
		//return을 확인하고 변수 결정
		
		System.out.println(result);
		// Y - 0 / N - 1 / C - 2
		
	}

}

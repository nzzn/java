package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		//�ھƹ���, �۾ƹ���, ���ƹ���
		
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			
			names[i] = 	JOptionPane.showInputDialog("�̸� �Է�");
		}
		for (int i = 0; i < names.length; i++) {
			
			//System.out.println(names[i]);
			
			if(names[i].equals("�ھƹ���")) {
				System.out.println((i+1) + "��°�� �ھƹ����� �־�� ");
				
			}
			
		}
		
	}

}

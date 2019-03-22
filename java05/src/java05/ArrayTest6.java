package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		//박아무개, 송아무개, 정아무개
		
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			
			names[i] = 	JOptionPane.showInputDialog("이름 입력");
		}
		for (int i = 0; i < names.length; i++) {
			
			//System.out.println(names[i]);
			
			if(names[i].equals("박아무개")) {
				System.out.println((i+1) + "번째에 박아무개가 있어요 ");
				
			}
			
		}
		
	}

}

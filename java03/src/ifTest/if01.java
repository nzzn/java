package ifTest;

import java.util.Date;

public class if01 {

	public static void main(String[] args) {
		//���� �ð��� �����ϱ� �����ϱ� �����ϱ� �Ǵ�
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if (hour < 12 ) {		
			System.out.println("�����̱���!");
		}
		
		else if(hour< 17) {
			System.out.println("�����̱���!");
		}
		
		else {
		System.out.println("���̱���!");
		}
		
	}

}

package java05;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		int[] num = {88, 77, 55, 44, 11, 66, 99}; 
		
	for (int i = 0; i < (num.length); i++) {
		
		System.out.println(i + ":" + num[i]);
		
		if(num[i]==11) {
			
			System.out.println((i+1) + "번째에 11이 있어요 ");
			
			}		
		
		}
	
	}

}

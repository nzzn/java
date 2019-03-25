package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		double[] eye = {2, 1.5 , 0.8 , 0.5 , 1.2 };
		System.out.println(eye.length);
		eye[0] = 1.7;
		
		for (double d : eye) {
			
			System.out.println(d);
		}
		
		String[] names = {"김아무개", "송아무개", "박아무개 ","정아무개", "이아무개"};
		
	
		for (int i = 0; i < eye.length; i++) {
			
			System.out.println(names[i] + " : " + eye[i]);
		}
	
		String[] score = {"A", "B", "C", "A", "F"};
	
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " : " + score[i]);
		
		}
	
	}
		
}	
		




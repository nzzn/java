package java15;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
/*
		//폴더나 파일을 만들어라
		File f1 = new File("c:/temp3");
		File f11 = new File("c:/temp2/t3");
		//위치를 찾아가라
		f1.mkdir();
		f11.mkdir();
	
		File f2 = new File("c:/temp3/test.txt");
		f2.createNewFile();
		*/
		
		System.out.println();
		File f3 = new File("c:/");
		String[] list =f3.list();
		System.out.println(list.length);
			
		File f4 =  new File("c:temp/2");
		System.out.println(f4.getName());
		System.out.println(f4.getPath());
		System.out.println(f4.isDirectory());
		 
	}

}

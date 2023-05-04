package javaexp.a13_io;

import java.io.IOException;
import java.io.File;

public class A04_File {

	public static void main(String[] args) {
		// 만든 하위 폴더 a01_fold 경로에 
		// E:\a01_javaexp\workspace_Bootcamp\javaexp\src\javaexp\a13_io\z01_data.txt
		// a01.txt - a03.txt 파일 3개 생성
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\a01_fold\\";
		File a01 = new File(path + "a01.txt");
		File a02 = new File(path + "a02.txt");
		File a03 = new File(path + "a03.txt");
		
		try {
			a01.createNewFile();
			a02.createNewFile();
			a03.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(a02.exists());

	}

}
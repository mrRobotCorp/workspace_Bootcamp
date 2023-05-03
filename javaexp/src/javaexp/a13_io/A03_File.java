package javaexp.a13_io;

import java.io.IOException;
import java.io.File;

public class A03_File {

	public static void main(String[] args) {
		// 1. 같은 폴더에 있는 파일 객체 생성
		File f01 = new File("E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\z01_data.txt");
		System.out.println("물리적 파일 존재 여부 : " + f01.exists());
		
		// 2. 물리적 파일 생성
		File f02 = new File("E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\z02_data.txt");
		
		// 3. 폴더 생성
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		File f03 = new File(path + "a02_fold");
		File f04 = new File(path + "a03_fold");
		File f05 = new File(path + "a04_fold");
		File f06 = new File(path + "a05_fold");
		
		try {
			// io가 일어나기 때문에 필수 예외 처리
			f02.createNewFile();
			f03.mkdir(); // make directory
			f04.mkdir();
			f05.mkdir();
			f06.mkdir();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f02.exists());

	}

}

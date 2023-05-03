package javaexp.a13_io;
import java.io.IOException;
import java.io.File;

public class A05_DirFile {

	public static void main(String[] args) {
		// ex) A05_DirFile.java 생성 / javaexp.a13_io.a01_fold 밑에 a01-a09 폴더 생성
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		
		for(int i=1; i<=9; i++) {
			File f = new File(path + "a0" + i);
			f.mkdir(); 
		}
		
	}

}

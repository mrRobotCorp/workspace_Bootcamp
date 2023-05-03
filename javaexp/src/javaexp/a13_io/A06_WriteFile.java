package javaexp.a13_io;

import java.io.IOException;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;

public class A06_WriteFile {

	public static void main(String[] args) {
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp";
		Writer fout = null;
		try {
			fout = new FileWriter(path + "z02_data.txt");
			fout.write("파일 내용 쓰기");
			fout.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fout.close();				
			} catch(IOException e) {
				
			}
		}

	}

}

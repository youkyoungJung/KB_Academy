package java02;

import java.io.File;

public class ExamFile {

	public static void main(String[] args) {
		File f = new File("."); //. 현재폴더(디렉토리)
		System.out.println(f.getAbsolutePath());
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
		}
	}

}

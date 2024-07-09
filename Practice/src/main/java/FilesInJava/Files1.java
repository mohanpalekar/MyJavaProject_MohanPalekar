package FilesInJava;

import java.io.File;

public class Files1 {

	public static void main(String[] args) {

		File file = new File("D:\\File");

		//		System.out.println(file.isDirectory());
		//		System.out.println(file.isFile());
		//		System.out.println(file.exists());
		//
		//		System.out.println(file.getAbsolutePath());
		//		System.out.println(file.mkdir());
		
		File [] files = file.listFiles();


		for(File f : files) {
			System.out.println(f.getName());
		}

	}

}

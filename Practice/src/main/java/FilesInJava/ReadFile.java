package FilesInJava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\File\\NewFile.txt");

		FileReader fr = new FileReader(file);
		
		int i ;
		
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		
		fr.close();

	}

}

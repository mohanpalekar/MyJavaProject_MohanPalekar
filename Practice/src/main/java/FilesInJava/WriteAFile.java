package FilesInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) throws IOException{

		FileWriter fr = null;

		try {
			File file = new File("D:\\File\\NewFile.txt");

			//file.createNewFile();

			fr = new FileWriter(file);

			fr.write("I am a new File\n");
			fr.write("I was added later\n");
			fr.write("I am a new File\n");
			fr.write("I am a new File\n");
			fr.write("I am a new File\n");
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fr.close();
			System.out.println("File Reader is closed");
		}

	}
}

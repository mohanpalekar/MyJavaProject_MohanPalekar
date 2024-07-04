package Collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class UseOfPropertiesInJava {
	
	public static void main(String[] args) throws IOException {
		
		//create an object of Properties class
		Properties props = new Properties();
		
		FileReader file = new FileReader("src/test/resources/practice.properties");
		
		props.load(file);
		
		System.out.println(props.get("username"));
		
		System.out.println(props.get("password"));
		
		
	}

}

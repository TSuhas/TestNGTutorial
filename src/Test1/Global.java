package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		
		FileInputStream file = new FileInputStream("D:\\eclipse-java-2022-06-R-win32-x86_64\\TestNGTutorial\\src\\Test1\\data.properties");
		
		prop.load(file);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
	    prop.setProperty("browser", "Microsoft Edge");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fille = new FileOutputStream("D:\\eclipse-java-2022-06-R-win32-x86_64\\TestNGTutorial\\src\\Test1\\data.properties");
		prop.store(fille, null);
		
		}
	}


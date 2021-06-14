package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		//to run the below methods, we are calling it from this main method
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	public static void readPropertiesFile() throws IOException {
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\megha\\eclipse-workspace\\Selenium\\src\\config\\config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
	}
	
	
	public static void writePropertiesFile() throws IOException {
		
		Properties prop = new Properties();  //we can also define this at the top as global variable
		OutputStream output = new FileOutputStream("C:\\Users\\megha\\eclipse-workspace\\Selenium\\src\\config\\config.properties");
		prop.setProperty("browser", "Chrome");
		prop.setProperty("result", "Pass");
		prop.store(output, "xyz");
	}
	
}

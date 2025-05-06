package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class utility {
	
	public static String getObjectFromPropertiesFile(String Key) {
		Properties prop = new Properties();
		FileReader reader = null;
		String rootPath;
		String appConfigPath = null;
		try {
//			rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//			appConfigPath = rootPath + "objectRepository.properties";
//			reader = new FileInputStream("src\\test\\resources\\objectRepository.properties");
			reader =  new FileReader("src\\test\\resources\\objectRepository.properties");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
//			prop.load(new FileInputStream(appConfigPath));
			prop.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(Key);
	}

	public static String getDataFromPropertiesFile(String Key) {
		Properties prop = new Properties();
		FileReader reader = null;;
		try {
			
			reader =  new FileReader("src\\test\\resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(Key);
	}

}

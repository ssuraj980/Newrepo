package Base_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Method_java {
	public static String Test_configuration(String key) throws IOException {
	String files="./Test configuration/config.properties";
	FileInputStream fis=new FileInputStream(files);
	
	//properties object creation
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	return value;
	}
	
	
	
	
	public static void send(WebElement ele,String value) {
		ele.sendKeys(value);
		
	}
	public static boolean click1(WebElement  ele1){
		
		ele1.click();
		return true;
	}
	
	public static void byindex(WebElement el,int index ) {
		Select select = new Select(el);
		select.selectByIndex(index);
	}
	public static void byvalue(WebElement el,String value) {
		
		Select select = new Select(el);
		select.selectByValue(value);
		
	}
	public static void byvisibletext(WebElement el , String value) {
		
		Select select = new Select(el);
		select.selectByVisibleText(value);
	}
	
		
		
	}


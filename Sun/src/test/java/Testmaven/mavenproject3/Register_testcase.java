package Testmaven.mavenproject3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base_class.Browser_testcase;
import Base_class.Method_java;

public class Register_testcase extends Browser_testcase {
	
	
	
	@Test
	public void tc1() throws IOException {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Kumar\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele1=driver.findElement(By.xpath("//a[@href='/register']"));
		Method_java.click1(ele1);
		   WebElement ele = driver.findElement(By.xpath("//input[@id='gender-male']"));
		   Method_java.click1(ele1);
		   WebElement register = driver.findElement(By.xpath("//input[@class='text-box single-line']"));
		   Method_java.send(ele,Method_java.Test_configuration("FirstName"));
		   WebElement lastname = driver.findElement(By.xpath("(//input[@data-val='true'])[2]"));
		   Method_java.send(lastname,Method_java.Test_configuration("LastName"));
		   WebElement email=driver.findElement(By.xpath("(//input[@data-val='true'])[3]"));
		   Method_java.send(email,Method_java.Test_configuration("Email"));
		   WebElement pwd=driver.findElement(By.xpath("(//input[@data-val='true'])[4]"));
		   Method_java.send(pwd, Method_java.Test_configuration("PassWord"));
		   WebElement confirm_pwd=driver.findElement(By.xpath("(//input[@data-val='true'])[5]"));
		   Method_java.send(confirm_pwd,Method_java.Test_configuration("Confirm_pwd"));
		   WebElement sub =driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		   Method_java.click1(sub);
		   WebElement log= driver.findElement(By.xpath("//a[@href='/logout']"));
		   Method_java.click1(log);
		   
	}
	
		
		
	}




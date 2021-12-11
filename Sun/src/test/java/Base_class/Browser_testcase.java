package Base_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser_testcase {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Browser_setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Kumar\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		String Url=Method_java.Test_configuration("appUrl");
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Browser_tear()
	{
		driver.close();
	}

}

package Com.BaseLayer;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\HybridFramework\\src\\main\\java\\Com\\configLayer\\data.properties");
			prop.load(fis);
		} catch (Exception e) {
						e.printStackTrace();
		}
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\BDDFramework\\BDDFramework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
	}
	
	
	
}

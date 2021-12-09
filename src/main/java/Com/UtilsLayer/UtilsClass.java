package Com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.BaseLayer.BaseClass;
import jdk.javadoc.doclet.Reporter;

public class UtilsClass extends BaseClass{
	
	//takes screen shot
	public static void captureScreenshot() throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String filename=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dist=new File("C:\\Users\\ADMIN\\Desktop\\ts\\abc"+filename+".png");
		FileUtils.copyFile(src,dist);
		String filepath=dist.toString();
		String path="C:\\Users\\ADMIN\\Desktop\\ts\\abc20211118083700.png";
		//Reporter
		Thread.sleep(5000);
	}
	
	//handle drop down
	public static void handleDropDown(WebElement wb,String text) {
		Select sel=new Select (wb);
		sel.selectByVisibleText(text);
		List<WebElement> ls=sel.getOptions();
		ls.size();
	}
	//handle popup
	public static void handleAlertPopup() {
		Alert act=driver.switchTo().alert();
		act.accept();
	}
	//handle frames ...child frames\
	public static void handleChildFrame(int frameindex) {
		driver.switchTo().frame(frameindex);
	}
	// handle frames ...top frames
	public static void handleTopFrame() {
		driver.switchTo().defaultContent();
	}
	//handle explicit wait
	public static void expliciteWait(int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
	//	wait.until(ExpectedCondition.visiblityofElement(By.id()))
	}
	
}

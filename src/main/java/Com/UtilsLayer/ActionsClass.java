package Com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.BaseLayer.BaseClass;

public class ActionsClass extends BaseClass {
	public static Actions act=new Actions(driver);
	// click on web webelement
	public static void clickOnWebelement(WebElement wb) {
		act.click(wb).build().perform();
	}
	public static void doubleclickOnWebelement(WebElement wb) {
		act.doubleClick(wb).build().perform();	
	}
	public static void rightClickOnWebelement(WebElement wb) {
	act.contextClick(wb).build().perform();	
	}
	public  static void dragAndDropOnWebelement(WebElement src, WebElement dest) {
		act.dragAndDrop(src, dest).build().perform();
	}
	public static void mouseOverAction(WebElement wb) {
		act.moveToElement(wb).build().perform();
	}
	public  static void scrollToEndOfPage() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	
	public  static void scrollToStartOfPage() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	public  static void sendUpercase(String text) {
		act.keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
	}
	
	
	
	
	
	
	
	
	
}

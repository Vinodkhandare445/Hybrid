package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class HomePage extends BaseClass{
		
	@FindBy(xpath="//div[@Class='header item']")
	WebElement logo;
	@FindBy(xpath="//span[@class='user-display']")
	WebElement name;
	@FindBy(xpath="//a[@href='/calendar']")
	WebElement calenderLink;
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactLink;
	

	@FindBy(xpath="//a[@href='/deals']")
	WebElement dealsLink;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	public void logoDisplay() {
		boolean a=logo.isDisplayed();
		System.out.println("logo is displayed"+a);
	}
	public void displayName() {
		boolean b =name.isDisplayed();
		System.out.println("display name"+b);
		String c=name.getText();
		System.out.println("display name"+c);
	}
	public void calenderLinkClick() {
		calenderLink.click();
	}
	
	public void dealsLinkClick() {
		dealsLink.click();
	}
	public void contactLinkClick() {
		contactLink.click();
	}
}
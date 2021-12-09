package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class ContactPage extends BaseClass{
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactLink;
	@FindBy(xpath="//button[@class='ui linkedin button'][text()='Create']")
	WebElement createButton;
	@FindBy(name="first_name")
	WebElement firstName;
	@FindBy(name="last_name")
	WebElement lastName;
	@FindBy(name="middle_name")
	WebElement middleName;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement companyName;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/div/div")
	WebElement companytag;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[1]/button")
	WebElement accessButton;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div")
	WebElement dpText;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[2]/div")
	WebElement dpTag;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement save;
	
	public ContactPage() {
		PageFactory.initElements(driver,this);
	}
	public void contactLinkClick() {
		contactLink.click();
	}
	public void createButtonClick() {
		createButton.click();
	}
	public void firstNameType(String fname) {
		firstName.sendKeys(fname);;
	}
	public void lastNameType(String lname) {
		lastName.sendKeys(lname);
	}
	public void middleNameType(String mname) {
		middleName.sendKeys(mname);
	}
	public void companyNameType(String cname) {
		companyName.sendKeys(cname);
	}
	
	public void companyTagType() {
		companytag.click();
	}
	public void accessButtonClick() {
		accessButton.click();
	}
	
	public void dpTextType() {
		dpText.click();
	}
	
	public void dpTagClick() {
		dpTag.click();
	}
	
	public void saveButtonClick() {
		save.click();
	}
	
}

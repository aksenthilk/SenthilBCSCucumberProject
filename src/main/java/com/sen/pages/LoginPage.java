package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;



public class LoginPage extends TestBase {
	public LoginPage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	/*public LoginPage() throws IOException {
		this.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
/*private Context context;
	
	public LoginPage(Context context){
		this.context = context;
	}
	
	WebDriver driver = context.getDriver();
	*/
	//My BCSrecruit
	
	//@FindBy(xpath = "//input[@name='email']")
	//WebElement emailField;
	
	By emailField = By.xpath("//input[@name='email']");
	
	//@FindBy(xpath = "//input[@name='password']")
	//WebElement passwordField;
	
	By passwordField = By.xpath("//input[@name='password']");
	
	//@FindBy(xpath = "//input[@value='Log in']")
	//WebElement loginBtn;
	
	By loginBtn = By.xpath("//input[@value='Log in']");
	
	By bcsLogo = By.xpath("//img[@alt='Jobs in BCSrecruit']");
	
	/*public LoginPage() {
		PageFactory.initElements(driver, this);
	}*/
	
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void clickOnBCSLogo(){
		driver.findElement(bcsLogo).click();
	}
	
	public MyJobSitePage enterCredentials(String emailId,String pwd) throws IOException{
		//emailField.clear();
		//emailField.sendKeys(emailId);
		
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(emailId);
		
		//passwordField.clear();
		//passwordField.sendKeys(pwd);
		
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(pwd);
		
		//loginBtn.click();
		
		driver.findElement(loginBtn).click();
		
		return new MyJobSitePage();
		
	}
	
	
	

}

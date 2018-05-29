package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;



public class HomePage extends TestBase{
	public HomePage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	/*public HomePage() throws IOException {
		TestBase.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
	
	//WebDriver driver = context.getDriver();

	// BCSrecruit.com

	//@FindBy(xpath = "//input[@class='txt_email']")
	//WebElement emailField;
		
	By emailField = By.xpath("//input[@class='txt_email']");

	//@FindBy(xpath = "//input[@value='Register']")
   // WebElement registerBtn;
	By registerBtn = By.xpath("//input[@value='Register']");

	//@FindBy(xpath = "//a[@title='Job Seeker Login']")
	//WebElement jobSeekerLoginBtn;
	
	By jobSeekerLoginBtn = By.xpath("//a[@title='Job Seeker Login']");
	
	//@FindBy(xpath = "//img[@alt='Jobs in BCSrecruit']")
	//WebElement logo;
	
	By logo = By.xpath("//a[@title='Job Seeker Login']");
	
	By careerAdvice = By.xpath("//a[text()='Career Advice']");
	
	By skillTextBox = By.id("fp_skill_include");
	
	By location = By.id("location_include");
	
	By search = By.xpath("//input[@value='Search']");
	
	

	//HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	public void enterEmailField(String emailAddress) {
		driver.findElement(emailField).sendKeys(emailAddress);
		//emailField.click();
		//emailField.sendKeys(emailAddress);
	}

	public AccountCreationPage clickOnRegister() throws IOException {
		driver.findElement(registerBtn).click();
		//registerBtn.click();
		return new AccountCreationPage();
	}

	public LoginPage clickOnLoginButton() throws IOException {
		driver.findElement(jobSeekerLoginBtn).click();
		//jobSeekerLoginBtn.click();
		return new LoginPage();
	}
	
	public LoginPage clickOnCareerAdvice() throws IOException {
		driver.findElement(careerAdvice).click();
		//jobSeekerLoginBtn.click();
		return new LoginPage();
	}
	
	public boolean validateLogo(){
		return driver.findElement(logo).isDisplayed();
		//return logo.isDisplayed();
	}
	
	public String homePageTitle(){
		return driver.getTitle();
	}
	
	public void enterSkillAndLocation(String skill,String loc){
		driver.findElement(skillTextBox).sendKeys(skill);
		driver.findElement(location).sendKeys(loc);
		driver.findElement(search).click();
		
		
	}

}

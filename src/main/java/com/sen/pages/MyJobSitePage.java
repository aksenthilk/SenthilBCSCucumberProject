package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;


public class MyJobSitePage extends TestBase{
	
	public MyJobSitePage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	/*public MyJobSitePage() throws IOException {
		this.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
/*private Context context;
	
	public MyJobSitePage(Context context){
		this.context = context;
	}
	
	WebDriver driver = context.getDriver();*/
	
	//My Jobsite
	
	//@FindBy(xpath = "//span[text()='Update your profile']")
	//WebElement updateProfile;
	
	By updateProfile = By.xpath("//span[text()='Update your profile']");
	
	//@FindBy(xpath = "//button[text()='Menu']")
	//WebElement menuBtn;
	
	By menuBtn = By.xpath("//button[text()='Menu']");
	
	//@FindBy(xpath = "//a[text()='Logout']")
	//WebElement logoutBtn;
	
	By logoutBtn = By.xpath("//a[text()='Logout']");
	
	/*public MyJobSitePage() {
		PageFactory.initElements(driver, this);
	}*/
	
	public String getMyJobSiteTitle(){
		return driver.getTitle();
		
	}
	
	public void validateUpdateProfile(){
		//boolean flag = updateProfile.isDisplayed();
		boolean flag = driver.findElement(updateProfile).isDisplayed();
	}
	
	public void clickOnMenu(){
		driver.findElement(menuBtn).click();
		//menuBtn.click();
	}
	
	public void clickOnLogout(){
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("argument[0].click();", logoutBtn);
		//driver.findElement(logoutBtn).click();
		//logoutBtn.click();
		Actions action = new Actions(driver);
		action.click(driver.findElement(logoutBtn));
			}

}

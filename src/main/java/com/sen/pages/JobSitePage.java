package com.sen.pages;

import java.awt.Checkbox;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;


public class JobSitePage extends TestBase {
	public JobSitePage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	/*public JobSitePage() throws IOException {
		this.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
	
	/*public JobSitePage(Context context){
		this.context = context;
	}
	
	WebDriver driver = context.getDriver();
	*/
	//Create your account with Jobsite
	
	//@FindBy(xpath = "//input[(@name='search_to_jbe') and (@class='checkbox')]")
	//WebElement jobAlertCheckBox;
	
	By jobAlertCheckBox = By.xpath("//input[(@name='search_to_jbe') and (@class='checkbox')]");
	
	//@FindBy(xpath = "//input[(@name='upload_cv') and (@class='checkbox')]")
	//WebElement uploadCVCheckBox;
	
	By uploadCVCheckBox = By.xpath("//input[(@name='upload_cv') and (@class='checkbox')]");
	
	//@FindBy(xpath = "//input[@value='Register']")
	//WebElement registerBtn;
	
	By registerBtn = By.xpath("//input[@value='Register']");
	
	/*public JobSitePage(){
		PageFactory.initElements(driver, this);
	}*/
	
	public String getJobSitePageTitle(){
		return driver.getTitle();
	}
	
	public void uncheckJobAlert(){
		boolean flag = driver.findElement(jobAlertCheckBox).isSelected();
		//boolean flag = jobAlertCheckBox.isSelected();
		if(flag){
			//jobAlertCheckBox.click();
			driver.findElement(jobAlertCheckBox).click();
		}
		
	}
	
	public void uncheckCV(){
		boolean flag = driver.findElement(uploadCVCheckBox).isSelected();
		//boolean flag = uploadCVCheckBox.isSelected();
		if(flag){
			//uploadCVCheckBox.click();
			try {
				driver.findElement(uploadCVCheckBox).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public MyJobSitePage clickOnRegister() throws IOException{
		driver.findElement(registerBtn).click();
		//registerBtn.click();
		return new MyJobSitePage();
	}

}

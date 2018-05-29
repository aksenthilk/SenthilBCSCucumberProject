package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sen.util.TestBase;
import com.sen.util.TestUtil;


public class AccountCreationPage extends TestBase{

/*public AccountCreationPage() throws IOException {
		this.driver=getDriver();
	}*/

	//Create an account - Jobsite: Register
	
	
	
	public AccountCreationPage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	By firstName = By.xpath("//input[@name='firstname']");
	
	By surname = By.xpath("//input[@name='surname']");
	
	By email = By.xpath("//input[@name='email']");
	
	By confirmEmail = By.xpath("//input[@name='confirm_email']");
	
	By password = By.xpath("//input[@name='password']");
	
	By confirmPassword = By.xpath("//input[@name='password_confirmation']");
	
	By countryDropDown = By.xpath("//select[@name='cc']");
	
	
	By electronics =By.xpath("//input[@data-ga-label='search_emp_mkt_cdEL']");
	
	
	By engineering = By.xpath("//input[@data-ga-label='search_emp_mkt_cdEN']");
	
	
	By nextStepBtn = By.xpath("//input[@value='Next Step']");
	
	//WebDriver driver = new ChromeDriver();
	
	/*public String getAccountPageTitle(){
		return driver.getTitle();	
		}*/
	
	public JobSitePage enterDetails(String first,String sName,String emailId,String emailConfirm,String pwd,String confirmPwd,String country) throws IOException{
		//firstName.clear();
		//firstName.sendKeys(first);
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(first);
		
		
		//surName.clear();
		//surName.sendKeys(sName);
		
		driver.findElement(surname).clear();
		driver.findElement(surname).sendKeys(sName);
		
		//email.clear();
		//email.sendKeys(emailId);
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(emailId);
		
		//confirmEmail.clear();
		//confirmEmail.sendKeys(emailConfirm);
		
		driver.findElement(confirmEmail).clear();
		driver.findElement(confirmEmail).sendKeys(emailConfirm);
		
		//password.clear();	
		//password.sendKeys(pwd);	
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
		
		driver.findElement(confirmPassword).clear();
		driver.findElement(confirmPassword).sendKeys(confirmPwd);
		
				
		//Select sel = new Select(countryDropDown);
		//sel.selectByValue(country);
		
		Select sel = new Select(driver.findElement(countryDropDown));
		sel.selectByVisibleText(country);
		
		//electronics.click();
		
		driver.findElement(electronics).click();
		  
		//engineering.click();
		
		driver.findElement(engineering).click();
		
		driver.findElement(nextStepBtn).click();
		
		//nextStepBtn.click();	
		
		return new JobSitePage();
			
		
	}
	
	
	
		
	}



package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sen.util.TestBase;



public class CareerAdvicePage extends TestBase{

	
	public CareerAdvicePage() throws IOException {
	//	super();
		// TODO Auto-generated constructor stub
	}

	/*public CareerAdvicePage() throws IOException {
		this.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
	
	//WebDriver driver = context.getDriver();
	//WebDriver driver = Context.getDriver();
	
	By bcsLogo = By.xpath("//img[@alt='Jobs in BCSrecruit']");
	
	public void clickOnBCSLogo(){
		driver.findElement(bcsLogo).click();
	}
	
	public String getCAPageTitle(){
		return driver.getTitle();
	}

}

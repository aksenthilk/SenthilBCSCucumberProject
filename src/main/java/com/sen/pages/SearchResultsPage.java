package com.sen.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sen.util.TestBase;



public class SearchResultsPage extends TestBase{
	public SearchResultsPage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	/*public SearchResultsPage() throws IOException {
		this.driver=TestBase.getDriver();
	}*/

	//WebDriver driver = new ChromeDriver();
/*private Context context;
	
	public SearchResultsPage(Context context){
		this.context = context;
	}
	
	WebDriver driver = context.getDriver();*/
	
	By bcsLogo = By.xpath("//img[@alt='Jobs in BCSrecruit']");
	
	public void clickOnBCSLogo(){
		driver.findElement(bcsLogo).click();
	}
	
	public String searchResultPageTitle(){
		return driver.getTitle();
	}

}

/*Author : Senthil*/
package com.sen.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.sen.pages.CareerAdvicePage;
import com.sen.pages.HomePage;
import com.sen.pages.LoginPage;
import com.sen.pages.SearchResultsPage;
import com.sen.util.TestBase;
import com.sen.util.TestUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	
	/*public HomePageSteps() throws IOException {
		super();
		}*/

	TestUtil test = new TestUtil();
	HomePage homepage = new HomePage();
	LoginPage loginPage = new LoginPage();
	CareerAdvicePage careerAdvice = new CareerAdvicePage();
	SearchResultsPage search = new SearchResultsPage();
	
	public HomePageSteps() throws IOException {
		this.driver=TestBase.getDriver();
	}
	
	/*@Before
	public void setUp(){
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}*/
	
	/*@After
	public void tearDown(){
		driver.close();
	}*/
	

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(test.HOMEPAGE_TITLE, homepage.homePageTitle());
	}
	
	@Then("^user clicks on Job seeker header link$")
	public void user_clicks_on_Job_seeker_header_link() throws IOException{
		homepage.clickOnLoginButton();
	}

	@Then("^user navigates to My BCSRecruit page$")
	public void user_navigates_to_My_BCSRecruit_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.LOGINPAGE_TITLE, loginPage.getLoginPageTitle());

	}

	@Then("^user clicks on the BCSrecruit logo$")
	public void user_clicks_on_the_BCSrecruit_logo(){
		loginPage.clickOnBCSLogo();
	}

	@Then("^navigates to home page$")
	public void navigates_to_home_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.HOMEPAGE_TITLE, homepage.homePageTitle());
	}

	@Then("^user clicks on Career Advice header link$")
	public void user_clicks_on_Career_Advice_header_link() throws IOException, InterruptedException{
		Thread.sleep(test.WAIT);
		homepage.clickOnCareerAdvice();
	}

	@Then("^user navigates to BCSrecruit Career Advice page$")
	public void user_navigates_to_BCSrecruit_Career_Advice_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.CAREERADVICEPAGE_TITLE, careerAdvice.getCAPageTitle());

	}

	@Then("^user clicks on BCSRecruit logo$")
	public void user_clicks_on_BCSRecruit_logo(){
		careerAdvice.clickOnBCSLogo();
	}

	@Then("^navigates to the home page$")
	public void navigates_to_the_home_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.HOMEPAGE_TITLE, homepage.homePageTitle());
	}

	@Then("^user closes the home page$")
	public void user_closes_the_home_page(){
		driver.close();
	}

	@Then("^user enters the keyword and location and clicks on Search button$")
	public void user_enters_the_keyword_and_location_and_clicks_on_Search_button() throws InterruptedException{
		//homepage.enterSkillAndLocation(ge.dataFromExcel(1, 0, 0), ge.dataFromExcel(1, 0, 1));
		Thread.sleep(test.WAIT);
		homepage.enterSkillAndLocation(prop.getProperty("keyword"), prop.getProperty("location"));
		
	}

	@Then("^user navigates to the BCSRecruit Search results page$")
	public void user_navigates_to_the_BCSRecruit_Search_results_page(){
		Assert.assertEquals(test.SEARCHRESULTSPAGE_TITLE,search.searchResultPageTitle());
	}

	@Then("^user clicks BCS Logo$")
	public void user_clicks_BCS_Logo(){
		search.clickOnBCSLogo();
	}

	@Then("^user navigates to the Home page$")
	public void user_navigates_to_the_Home_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.HOMEPAGE_TITLE, homepage.homePageTitle());
	}

	@Then("^user closes home page$")
	public void user_closes_home_page(){
		driver.quit();
	}

}

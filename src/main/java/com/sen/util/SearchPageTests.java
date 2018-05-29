package com.sen.util;

import java.io.IOException;

import org.junit.Assert;

import com.sen.pages.HomePage;
import com.sen.pages.SearchResultsPage;
import com.sen.util.TestBase;
import com.sen.util.TestUtil;

import cucumber.api.java.en.Then;

public class SearchPageTests extends TestBase {
	/*public SearchPageTests() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}*/

	HomePage homepage = new HomePage();
	TestUtil test = new TestUtil();
	SearchResultsPage search = new SearchResultsPage();

	public SearchPageTests() throws IOException {
		this.driver=TestBase.getDriver();
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

	@Then("^user clicks on BCS Logo$")
	public void user_clicks_on_BCS_Logo(){
		search.clickOnBCSLogo();
	}

	@Then("^user navigates to Home page$")
	public void user_navigates_to_Home_page() throws InterruptedException{
		Thread.sleep(test.WAIT);
		Assert.assertEquals(test.HOMEPAGE_TITLE, homepage.homePageTitle());
	}

	
	

}

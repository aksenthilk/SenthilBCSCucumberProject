package com.sen.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hwpf.model.FileInformationBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase () throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("G:\\SeleniumCucumberWorkSpace\\BCSProject\\src\\main\\java\\com\\sen\\config\\config.properties");
		prop.load(fis);
	}
	
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
		return driver = new ChromeDriver();
		
	}
	
	
	
	

}

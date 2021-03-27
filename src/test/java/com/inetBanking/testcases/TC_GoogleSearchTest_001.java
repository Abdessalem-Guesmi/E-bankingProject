package com.inetBanking.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.intBanking.pages.GoogleSearch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_GoogleSearchTest_001 {
	private WebDriver driver;

	@Test
	public void searchTest() {
		GoogleSearch googleSearch = new GoogleSearch(driver);
		googleSearch.setCountry("tunisia");

	}

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}
}

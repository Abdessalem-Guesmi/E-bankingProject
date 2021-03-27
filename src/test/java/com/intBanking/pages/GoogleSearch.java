package com.intBanking.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
	public WebDriver driver;
	private By inputField = By.name("q");
	private By buttonClick = By.name("btnk");

	public GoogleSearch(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void setCountry(String country) {
		driver.findElement(inputField).sendKeys(country);

		List<WebElement> myElements = driver
				.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li"));
		System.out.println(myElements.size());

		for (WebElement e : myElements) {
			System.out.println(e.getText());
			if (e.getText().contains("tunisiasat")) {
				Actions builder = new Actions(driver);
				Action mouseOverHome = builder.moveToElement(e).click().build();

				mouseOverHome.perform();
			}
		}

	}

	public void clickSubmit() {
		driver.findElement(buttonClick).click();

	}

}

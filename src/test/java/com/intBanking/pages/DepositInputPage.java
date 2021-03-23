package com.intBanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositInputPage {
	public WebDriver driver;
	private By accountNoField = By.name("accountno");
	private By ammountField = By.name("ammount");
	private By descField = By.name("desc");
	private By submitButton = By.name("AccSubmit");

	public DepositInputPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void setAccountNo(String accountNo) {
		driver.findElement(accountNoField).sendKeys(accountNo);
	}

	public void setAmmount(String ammount) {
		driver.findElement(ammountField).sendKeys(ammount);
	}

	public void setDescription(String descreption) {
		driver.findElement(descField).sendKeys(descreption);
	}

	public ValidationDepositPage clickSubmit() {
		driver.findElement(submitButton).click();
		return new ValidationDepositPage(driver);
	}

}

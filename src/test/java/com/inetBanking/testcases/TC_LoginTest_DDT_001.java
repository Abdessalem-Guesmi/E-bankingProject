package com.inetBanking.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.utilities.BaseTest;
import com.inetBanking.utilities.ExcelUtils;
import com.intBanking.pages.LoginPage;

public class TC_LoginTest_DDT_001 extends BaseTest {
	@Test(dataProvider = "dataLogin")
	public void loginDTT(String username, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickSubmit();
	}

	@DataProvider(name = "dataLogin")
	public Object[][] getData() {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "./Configuration/data.xlsx";
		Object data[][] = ExcelUtils.testData(excelPath, "sheet1");
		return data;

	}

}

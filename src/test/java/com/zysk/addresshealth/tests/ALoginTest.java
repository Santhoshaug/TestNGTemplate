package com.zysk.addresshealth.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.HomePage;
import com.zysk.addresshealth.testComponents.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ALoginTest extends BaseTest {
	String productName = "ZARA COAT 3";

	@Test(dataProvider = "getData", groups = "Purchase")
	public void submitOrder(HashMap<String, String> input) throws Exception
	// public void submitOrder(String email,String password, String productName)
	// throws Exception
	{
		HomePage homePage = alandingPage.loginApplication(input.get("email"), input.get("password"));
		
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\PurchaseOrder.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

//	@DataProvider
//	public Object[][] getData()
//	{
//		return new Object[][] {{"santhoshaug@gmail.com","Test@1234","ZARA COAT 3"},{"rachayya@gmail.com","Test@1234","ADIDAS ORIGINAL"}};
//	}

//  @DataProvider
//	public Object[][] getData() throws IOException
//	{
//	HashMap<String, String> map=new HashMap<String, String>();
//	map.put("email", "santhoshaug@gmail.com");
//	map.put("password", "Test@1234");
//	map.put("productName", "ZARA COAT 3");
//	
//	HashMap<String, String> map1=new HashMap<String, String>();
//	map1.put("email", "rachayya@gmail.com");
//	map1.put("password", "Test@1234");
//	map1.put("productName", "ADIDAS ORIGINAL");
//	return new Object[][] {{map},{map1}};
//}
	
	/*
	 * @Test(dependsOnMethods = { "submitOrder" }) public void orderHistoryTest() {
	 * HomePage homePage = alandingPage.loginApplication("santhoshaug@gmail.com",
	 * "Test@1234");
	 * 
	 * }
	 */

}

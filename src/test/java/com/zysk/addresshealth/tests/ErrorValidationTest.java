package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.HomePage;
import com.zysk.addresshealth.testComponents.BaseTest;
import com.zysk.addresshealth.testComponents.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ErrorValidationTest extends BaseTest{
	
	@Test(groups = {"ErrorHandling"},retryAnalyzer = Retry.class)
	public void errorValidation() throws Exception
	{
		String productName = "ZARA COAT 3";
		
		HomePage homePage=alandingPage.loginApplication("santaug@gmail.com", "Test@1234");
		Assert.assertEquals("Incorrect email or password.", alandingPage.getErrorMessage()); 
		
	}
}

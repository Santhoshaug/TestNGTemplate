package com.zysk.addresshealth.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class ALandingPage extends AbstractComponent {

	WebDriver driver;

	public ALandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail=driver.findElement(By.id("userEmail"));

	// PageFactory
	@FindBy(id = "userEmail")
	WebElement mail;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(name = "login")
	WebElement submit;

	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

	public HomePage loginApplication(String email, String pwd) {
		mail.sendKeys(email);
		password.sendKeys(pwd);
		submit.click();
		HomePage homePage = new HomePage(driver);
		return homePage;
	}

	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}

}
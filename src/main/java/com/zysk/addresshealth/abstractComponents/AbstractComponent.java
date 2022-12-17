package com.zysk.addresshealth.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import rahulShettyAcamedy.pageobjects.CartPage;
//import rahulShettyAcamedy.pageobjects.OrdersPage;

public class AbstractComponent {

	WebDriver driver;			
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementToAppear(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	public void waitForElementToDisappear(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear(WebElement findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	@FindBy(xpath=("//button[contains(.,'Cart ')]"))
	WebElement cartHeader;
	
	@FindBy(xpath=("//button[contains(.,'ORDERS')]"))
	WebElement ordersHeader;
	
	/*
	 * public CartPage goToCartPage() { cartHeader.click(); CartPage cartPage=new
	 * CartPage(driver); return cartPage; }
	 * 
	 * public OrdersPage goToOrdersPage() { ordersHeader.click(); OrdersPage
	 * ordersPage=new OrdersPage(driver); return ordersPage; }
	 */
}
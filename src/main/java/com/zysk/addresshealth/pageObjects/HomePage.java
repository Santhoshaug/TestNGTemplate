package com.zysk.addresshealth.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {

	WebDriver driver;

	public CustomerPage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//button[contains(text(), 'Customers')]") WebElement customerButton;

public void customer() {
	customerButton.click();
}


	
}

package com.wipro.PageobjectModelAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class store_webkul {
WebDriver driver;
	
	public store_webkul(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	By clicklogin =By.xpath("//a[@class='ws-btn-menu ws-btn-ghost-menu wk-customer-login-link']");
	By login=By.xpath("//input[@id='wk-login-email']");
	By password=By.xpath("//input[@id='wk-login-pass']");
	By submit =By.xpath("//button[@id='send2']//span//span[contains(text(),'Login')]");
	
	
	
	public void clickloginlink() {
		driver.findElement(clicklogin).click();
	}
	public void typeemail() {
		driver.findElement(login).sendKeys("alambashakoutal@gmail.com");
	}

	public void typepassword() {
		driver.findElement(password).sendKeys("Alambasha1618");
	}
	public void submit() {
		driver.findElement(submit).click();
	}
}

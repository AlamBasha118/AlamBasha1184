package com.wipro.PageobjectModelAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class opensourcedemo {
	WebDriver driver;
	
	public opensourcedemo(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	By login=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By submit =By.xpath("//button[@type='submit']");
	
	
	
	
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

package com.wipro.PageobjectModelAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class hollandburret {

		WebDriver driver;
		
		public hollandburret(WebDriver ldriver) {
			
			this.driver=ldriver;
		}
		By login=By.id("username");
		By password=By.id("password");
		By submit =By.xpath("//button[@name='action']");
		
		
		
		
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

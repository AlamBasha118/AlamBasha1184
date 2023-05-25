package Test_Cases_login_pages;

import com.wipro.PageobjectModelAssignment.*;
import org.testng.annotations.Test;

public class TestCase_Webkul extends BaseClass{
	@Test
	public void logintest() throws Exception{
		
		driver.navigate().to("https://store.webkul.com/");
		Thread.sleep(10000);
		store_webkul loginpage=new store_webkul(driver);
		loginpage.clickloginlink();
		loginpage.typeemail();
		loginpage.typepassword();
		loginpage.submit();
	}
}

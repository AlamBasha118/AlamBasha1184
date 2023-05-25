package Test_Cases_login_pages;

import com.wipro.PageobjectModelAssignment.*;
import org.testng.annotations.Test;

public class TestCase_opensource extends BaseClass{
	
	@Test
	public void logintest() throws Exception {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		opensourcedemo loginpage=new opensourcedemo(driver);
		loginpage.typeemail();
		loginpage.typepassword();
		loginpage.submit();
	}

}

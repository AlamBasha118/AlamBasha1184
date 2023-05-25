package Test_Cases_login_pages;


import org.testng.annotations.Test;
import com.wipro.PageobjectModelAssignment.*;
public class TestCase_hollandandburret extends BaseClass{
		
		@Test
		public void logintest() throws Exception {
			
			driver.navigate().to("https://auth.hollandandbarrett.com/u/login?state");
			hollandburret loginpage=new hollandburret(driver);
			loginpage.typeemail();
			loginpage.typepassword();
			loginpage.submit();
		}
	
}

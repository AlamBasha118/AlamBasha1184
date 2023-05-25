package Test_Cases_login_pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\TestNG Onwards\\7.PageobjectModelAssignment\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}

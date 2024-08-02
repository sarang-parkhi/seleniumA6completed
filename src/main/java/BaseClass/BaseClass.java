package BaseClass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import JavaUtility.UtilityClass;
import Pom.VTigerLogin;

public class BaseClass {
	public WebDriver driver;

	
	@BeforeClass
	public void preCondition() throws IOException {
		String url = UtilityClass.loginData("url");
		String browser = UtilityClass.loginData("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	
	@BeforeMethod
	public void login() throws IOException {
		
		VTigerLogin log=new VTigerLogin(driver);
		log.getUsername();
		log.getPassword();
		log.getLogin_button();

		}
	

	@AfterMethod
	public void logout() {
		//driver.close();
	}

	@AfterClass
	public void postCondition() {
		//driver.close();
	}
}

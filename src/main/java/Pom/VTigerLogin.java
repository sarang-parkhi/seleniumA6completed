package Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import JavaUtility.UtilityClass;

public class VTigerLogin {
	public VTigerLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	
		
	    private @FindBy(xpath ="//input[@type='text']")
	    WebElement username;
	    
		private @FindBy(xpath="//input[@type='password']")
		WebElement password;
		
		private @FindBy(xpath = "//input[@type='submit']")
		WebElement login_button;


		public void getUsername() throws IOException {
			String username2=UtilityClass.loginData("username");
			username.sendKeys(username2);
			
			
			
		}

		public void getPassword() throws IOException {
			String password2=UtilityClass.loginData("password");
			password.sendKeys(password2);
		}

		public void getLogin_button() {
			login_button.click();;
		}
		
	}
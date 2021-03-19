package loginfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjRepos.LoginObjRepo;

public class Login {
	WebDriver driver = new ChromeDriver();
	WrappersClass wrap = new WrappersClass();
	
	@Test
	public void launchBrowser() {
		        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		        driver.get("https://opensource-demo.orangehrmlive.com/");
		    }
	
	public void login(String text, String password) {
		wrap.enterText(LoginObjRepo.userName, text);
		wrap.enterText(LoginObjRepo.password, password);
	}
	}


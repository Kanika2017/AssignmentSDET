package loginfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WrappersClass extends Login{
	
	public void enterText(String locator, String text) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(text);
	}

	

}
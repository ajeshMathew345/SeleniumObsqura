package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void locatingbyid() {
		WebElement message = driver.findElement(By.id("single-input-field"));
	}
	public void locatingbyclass() {
		WebElement elementname=driver.findElement(By.className("form-check-input"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

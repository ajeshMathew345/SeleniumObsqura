package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void locatingbyid() {
		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement message1 = driver.findElement(By.id("value-a"));
		WebElement message2 = driver.findElement(By.id("value-b"));
		WebElement message3 = driver.findElement(By.id("inlineRadio21"));
		WebElement message =driver.findElement(By.id("inlineRadio22"));
		
	}
	public void locatingbyclass() {
		WebElement elementname=driver.findElement(By.className("form-check-input"));
		WebElement selectall=driver.findElement(By.className("btn btn-primary"));
		WebElement select2 = driver.findElement(By.className("btn btn-primary"));
		
	
	}
public void locatingbyName() {
		
		WebElement name = driver.findElement(By.name("viewport"));
	}
	
	public void locatingbyLinkText() {
		
		WebElement linktext = driver.findElement(By.linkText("check-box-demo.php"));
	}
	
	public void locatingbyPartialLinkText() {
		
		WebElement partiallink = driver.findElement(By.partialLinkText("simple-form"));
	}
	
	//css selector
	
	public void locatingbyCssTagandId() {
		
		WebElement tagandid = driver.findElement(By.cssSelector("input#single-input-field"));
	}
	
	public void locatingbyTagandClass() {
		
		WebElement tagandclass = driver.findElement(By.cssSelector("input.form-control"));
	}
	
	public void locatingbyTagandAttribute() {
		
		WebElement tagandattribute = driver.findElement(By.cssSelector("input[id=single-input-field]"));
	}
	
	public void locatingbyTagClassAttribute() {
		
		WebElement tagclassattribute = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}

	public static void main(String[] args) {
		

	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

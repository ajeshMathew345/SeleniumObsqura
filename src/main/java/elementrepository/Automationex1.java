package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automationex1 extends Base  {

	public static void main(String[] args) {
		Automationex1 obj=new Automationex1();
		obj.initialisebrowser();
		obj.EnterMessage();
		obj.EnterValue();
	}
public void EnterMessage() {
	WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	inputform.click();
	WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	entermessage.sendKeys("Hi");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessage.click();
	
	
	
}

public void EnterValue() {
	WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	valueA.sendKeys("55");
	WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	valueB.sendKeys("65");
	WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotal.click();
	
}

}

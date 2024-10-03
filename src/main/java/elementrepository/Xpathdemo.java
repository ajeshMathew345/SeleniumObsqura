package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpathdemo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void absoluteXpath() {
	WebElement absolute=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
}
public void relativeXpath() {
	WebElement absolute=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement absolute1 =driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement absolute2 =driver.findElement(By.xpath("//input[@id='value-a']"));
}

public void dynamicXpath()
{
	WebElement dynamic=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));//contains
	WebElement dynamic1=driver.findElement(By.xpath("//input[contains(@class,'form-control')]"));
	WebElement dynamic2=driver.findElement(By.xpath("//div[contains(@class,'my-2')]"));
		
}
WebElement Xpathwithtext=driver.findElement(By.xpath("//button[text()='Show Message']"));//text
WebElement Xpathwithtext2=driver.findElement(By.xpath("//div[text()=' Total A + B : ']"));
WebElement Xpathwithtext3=driver.findElement(By.xpath("//div[text()='  Two Input Fields ']"));

//div[text()=' Total A + B : ']

WebElement axes=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));

WebElement axes1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));

WebElement axes2=driver.findElement(By.xpath("//input[@type='text']//following::input"));

//input[@type='text']//following::input

//button[@id='button-one']//parent::form
}
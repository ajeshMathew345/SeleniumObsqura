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
}
WebElement dynamic1=driver.findElement(By.xpath("//button[text()='Show Message']"));//text

WebElement axes=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
}
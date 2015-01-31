package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.InvalidSelectorException;
public class testN11 {
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException{
		driver.get("http://www.n11.com");
		WebElement link;
		link = driver.findElement(By.linkText("Giriþ Yap"));
		link.click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("brctanrikut@hotmail.com");
		WebElement burcu;
		burcu = driver.findElement(By.id("password"));
		burcu.sendKeys("SELEdene2015");
		burcu.submit();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchData"));
		searchBox.click();
		driver.findElement(By.id("searchData")).sendKeys("samsung");
		WebElement css;
		css= driver.findElement(By.cssSelector("a.searchBtn"));
		css.click();
		Thread.sleep(5000);
		WebElement link2;
		link2= driver.findElement(By.linkText("2"));
		link2.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='p-28107268']/div[2]/span[2]")).click();
		Thread.sleep(5000);
		WebElement link3;
		link3= driver.findElement(By.linkText("Hesabým"));
		link3.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='myNavigation']/li[3]/a")).click();
		Thread.sleep(5000);
		WebElement kaldir;
		kaldir= driver.findElement(By.linkText("Kaldýr"));
		kaldir.click();
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}

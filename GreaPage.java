package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GreaPage {
	WebDriver driver;
	@BeforeSuite
	public void openUrl() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	@Test
	public void selectGear() throws InterruptedException
	{
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class=\"level0 nav-4 category-item level-top parent ui-menu-item\"]//child::a[@id=\"ui-id-6\"]")).click();
		driver.findElement(By.linkText("Bags")).click();
	}
	
}

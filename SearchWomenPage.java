package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SearchWomenPage {
WebDriver driver;
	
	@BeforeSuite
	public void womenSearch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void tops() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='ui-id-4']//child::span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Tops")).click();
	}
	@Test(priority=2)
	public void selectTops()
	{
		driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
		driver.findElement(By.xpath("//img[@alt='Circe Hooded Ice Fleece']")).click();
		
	}
	@Test(priority=3)
	public void selectSize()
	{
		driver.findElement(By.id("option-label-size-143-item-168")).click();
	}
	@Test(priority=4)
	public void selectColor()
	{
		driver.findElement(By.id("option-label-color-93-item-52")).click();
	}
	@Test(priority=5)
	public void addToCart()
	{
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
	}
	@Test(priority=6)
	public void addToWishList()
	{
		driver.findElement(By.xpath("//div[@class='product-addto-links']//child::a[@data-action='add-to-wishlist']")).click();
	}

}

package Utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tempat
{
	
	public static void main(String[]args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","E:\\Automation support2\\chromedriver.exe" );
	 
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 

		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		
	driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
	driver.findElement(By.xpath("(//*[@height='24'])[2]")).click();
	
	Select abc=new Select(driver.findElement(By.xpath("//*[@name='lst_countryS']")));
	//abc.selectByIndex(1);
	//abc.selectByValue("INDIA");
	//.selectByVisibleText("INDIA");
/*	Thread.sleep(5000);
	int Total=driver.findElementsByTagName("select").size();
	System.out.println(Total);*/
	
	String s= driver.getCurrentUrl();
	System.out.println(s);	
	
	}
	



}
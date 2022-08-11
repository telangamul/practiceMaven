package Utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.HashBasedTable;

public class Seleniumops
{
	public static  WebDriver driver=null;
	public static Hashtable<String,Object> outputparametr =new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLonch(Object[]inputparmetr)
	{
		try{
		 String bname=(String) inputparmetr[0];
		 String exe=(String) inputparmetr[1];
		 
		if(bname.equalsIgnoreCase("chrome"))
		{
	    System.setProperty("webdriver.chrome.driver",exe);
	    
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("FF"))
		{
			 System.setProperty("webdriver.goodriver.driver",exe);
			    
		     driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:browserLonch,Input Given:"+ inputparmetr[0].toString());
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:browserLonch,Input Given:"+ inputparmetr[0].toString());
		}
		return outputparametr;
		
	}
	public static Hashtable<String,Object> openApplication(Object[]inputparmetr) 
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		String url=(String) inputparmetr[0];
	 
		driver.get(url);
	
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:openApplication,Input Given:"+ inputparmetr[0].toString());
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:openApplication,Input Given:"+ inputparmetr[0].toString());
		}
		return outputparametr;

	}
	
	public static Hashtable<String,Object>Clickeonelement(Object[]inputparmetr) throws InterruptedException 
	{
		try
		{
		String Xpath=(String) inputparmetr[0];
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		driver.findElement(By.xpath(Xpath)).click();
		
		
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:Clickeonelement,Input Given:"+ inputparmetr[0].toString());
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:Clickeonelement,Input Given:"+ inputparmetr[0].toString());
		}
		
		return outputparametr;

	}
	public static Hashtable<String,Object>Mouseover(Object[]inputparmetr) 
	{
		try
		{
		String Xpath=(String) inputparmetr[0];
	 
		Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(Xpath));
		act.moveToElement(abc).build().perform();
		
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:Mouseover,Input Given:"+ inputparmetr[0].toString());
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:Mouseover,Input Given:"+ inputparmetr[0].toString());
		}
		return outputparametr;

	}
	public static Hashtable<String,Object>SendKeys(Object[]inputparmetr) 
	{
		try
		{
	     String KEY=(String) inputparmetr[0];
	     String Text=(String) inputparmetr[1];
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath(KEY)).sendKeys(Text);
		
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:SendKeys,Input Given:"+ inputparmetr[1].toString()); 
		
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:SendKeys,Input Given:"+ inputparmetr[1].toString());
		}
		return outputparametr;

	}

	

	public static Hashtable<String,Object>valid(Object[]inputparametr) throws InterruptedException
	{
		try
		{
		Thread.sleep(5000);
		String xpath=(String) inputparametr[0];
		String text=(String) inputparametr[1];
		
		String acultext=driver.findElement(By.xpath(xpath)).getText();
		
		if(acultext.equalsIgnoreCase(text))
		{
			System.out.println("Pass");
		}
		else
		{
			
			System.out.println("fail");
		}
		
		outputparametr.put("STATUS", "Pass");
		outputparametr.put("MESSAGE", "Methord:valid,Input Given:"+ inputparametr[1].toString());
		}
		catch(Exception e)
		{
			outputparametr.put("STATUS", "Fail");
			outputparametr.put("MESSAGE", "Methord:valid,Input Given:"+ inputparametr[1].toString());
		}
		return outputparametr;

	}
	
	

}

package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
public static WebDriver driver;
public static FileInputStream fis;
public static String projectpath=System.getProperty("user.dir");
public static Properties pro;
public static void proload() throws Exception
{
	fis=new FileInputStream(projectpath+"\\data1.properties");
	pro=new Properties();
	
	pro.load(fis);
}



	public static void launch(String browser)
	{
		if(pro.getProperty(browser).equals("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(pro.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
				
		}
	}
		public static void navigateurl(String url )
		{
			driver.get(pro.getProperty(url));
		
			
			
			
		}



}


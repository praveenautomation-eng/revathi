package com.Praveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		//WebElement loc = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		//loc.sendKeys("sony");
		
		//Thread.sleep(3000);
		
		//loc.clear();
		
		//driver.findElement(By.partialLinkText("AmazonBasic")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}	
		}
		
	}

}

package com.Praveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest 
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test=report.startTest("TC_004");
		test.log(LogStatus.INFO, "Loading properties files .........");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launching the Browser :-"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Launched the url :- "+ envprop.getProperty("amazonurl"));

		//String actualLink = driver.findElement(By.linkText("AmazonBasics")).getText();
		/*
		 * String actualLink =
		 * driver.findElement(By.linkText("AmazonBasics")).getAttribute("innerHTML");
		 * String expectedLink="Amazon";
		 * 
		 * System.out.println("Actual Link : " + actualLink);
		 * System.out.println("Expected Link : " + expectedLink);
		 * 
		 * //if(actualLink.equals(expectedLink))
		 * //if(actualLink.equalsIgnoreCase(expectedLink))
		 * if(actualLink.contains(expectedLink))
		 * System.out.println("Both links are equal....."); else
		 * System.out.println("Both links are not equal.....");
		 */
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("sony");
		String var = loc.getAttribute("value");
		System.out.println("Text is :" + var);
	}

}

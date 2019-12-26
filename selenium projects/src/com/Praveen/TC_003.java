package com.Praveen;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Loading properties files .........");
		
		launch("chromebrowser");
		log.info("Launching the Browser :-"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Launched the url :- "+ envprop.getProperty("amazonurl"));
		
		selectItem("amazondropbox_id","amazondropvalue");
		log.info("Selected the item :- " + orprop.getProperty("amazondropvalue")+ " by using he property :- " + orprop.getProperty("amazondropbox_id"));
		
		typeValue("amazonsearchbox_id","amazontextvalue");
		log.info("Entered the value :- " + orprop.getProperty("amazontextvalue")+ " by using he property :- " + orprop.getProperty("amazonsearchbox_id"));
		
		elementClick("amazonsearchbutton_xpath");
		log.info("Clicked on element by using the property :- " + orprop.getProperty("amazonsearchbutton_xpath"));
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}

	

}

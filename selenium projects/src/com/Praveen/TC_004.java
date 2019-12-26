package com.Praveen;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
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
		
		selectItem("amazondropbox_id","amazondropvalue");
		test.log(LogStatus.INFO, "Selected the item :- " + orprop.getProperty("amazondropvalue")+ " by using he property :- " + orprop.getProperty("amazondropbox_id"));
		
		typeValue("amazonsearchbox_id","amazontextvalue");
		test.log(LogStatus.INFO, "Entered the value :- " + orprop.getProperty("amazontextvalue")+ " by using he property :- " + orprop.getProperty("amazonsearchbox_id"));
		
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on element by using the property :- " + orprop.getProperty("amazonsearchbutton_xpath"));

		report.endTest(test);
		report.flush();

	}

	

}

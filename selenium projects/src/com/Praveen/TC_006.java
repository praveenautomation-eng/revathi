package com.Praveen;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest 
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

		  String expectedLink="AmazonBasic"; 		  
		 if(!verifyLink("amazonbasics_linktext",expectedLink))
			 reportFailure("Both links are not equal......");
		 else
			 reportSuccess("Both links are equal......");
		
		 report.endTest(test);
		 report.flush();
	}
}

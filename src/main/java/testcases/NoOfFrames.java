package testcases;

import org.junit.Test;
import org.openqa.selenium.By;

import wrappers.GenericWrappers;

public class NoOfFrames extends GenericWrappers {
	
	@Test
	public void Invokeapp() throws Exception{
		
		//Getting the URL
		invokeApp("chrome", "http://layout.jquery-dev.com/demos/iframes_many.html");		

        //Get Size of Frames 
		int size = findelementsByTagNamesize("iframe");
		System.out.println("Size of Main frames aare "+size);
				
		//Initoalizing Loop for count of Frames 
		 for (int i =0;i< size ;i++)
		 {
			 switchToFrame(i);			 
			 int count =0;
			 count = findelementsByTagNamesize("iframe");
				
			 switchToDefault();
			 System.out.println("inner frame" +i +"total is "+ count );

		 }

				
	}

	
}

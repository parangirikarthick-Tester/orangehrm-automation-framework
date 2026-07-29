package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class DummyTest extends BaseClass{

	
	
		
		@Test
		public void checkTitle()
		{
			System.out.println("Page title is: " + driver.getTitle());
		
	}
	

}

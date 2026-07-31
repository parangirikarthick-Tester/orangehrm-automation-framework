package pageelements;

import common.LookupDetails;

public enum LoginPageElements implements LookupDetails {
	
	USERNAME("xpath", "//input[@name='username' and @placeholder='Username']"),
	PASSWORD("xpath", "//input[@name='password' or @type='password']"),
	LOGIN_BUTTON("xpath", "//button[@type='submit']"),
	DASHBOARD_TEXT("xpath", "//h6[text() = 'Dashboard']"),
	
	;
	
	private String locatorType;
	private String locatorValue;
	
	LoginPageElements(String locatorType, String locatorValue )
	{
		this.locatorType = locatorType;
		this.locatorValue = locatorValue;
	}
	

	@Override
	public String getLocatorType() {
		// TODO Auto-generated method stub
		return locatorType;
	}

	@Override
	public String getLocatorValue() {
		// TODO Auto-generated method stub
		return locatorValue;
	}
	
	

}

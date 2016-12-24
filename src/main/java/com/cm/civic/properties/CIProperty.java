package com.cm.civic.properties;

/**
 * Enumerates the properties that should be configured in the civicinformation.properties file, which
 * should exist on the class path
 * 
 * @author jmoser
 *
 */
public enum CIProperty
{
	/**
	 * The API key provided by Google granting access to the Google Civic Information API
	 */
	API_KEY("apiKey");
	
	private final String key;
	
	private CIProperty(final String key)
	{
		this.key = key;
	}
	
	/**
	 * Returns this property's String key
	 * 
	 * @return
	 */
	public String getKey()
	{
		return key;
	}
}

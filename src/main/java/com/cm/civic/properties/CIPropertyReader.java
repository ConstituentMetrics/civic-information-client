package com.cm.civic.properties;

import java.util.ResourceBundle;

import org.apache.commons.lang3.Validate;

/**
 * Accesses user properties set in the civicinformation.properties file in src/main/resources
 * 
 * @author jmoser
 *
 */
public class CIPropertyReader
{
	public static final String CI_PROPERTIES = "civicinformation";
	
	private ResourceBundle bundle;
	
	public CIPropertyReader()
	{
		this.bundle = ResourceBundle.getBundle(CI_PROPERTIES);
	}
	
	/**
	 * Retrieves the value of the property assigned to the provided key
	 * 
	 * @param key
	 * @return
	 */
	public String getProperty(String key)
	{
		Validate.notEmpty("Key must not be empty or null!");
		
		return bundle.getString(key);
	}
	
	/**
	 * Returns the ResourceBundle containing the properties in the CivicInformation.properties file
	 * 
	 * @return
	 */
	public ResourceBundle getBundle()
	{
		return bundle;
	}
}

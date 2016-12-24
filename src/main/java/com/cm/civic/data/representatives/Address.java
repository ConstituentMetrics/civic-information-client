package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents a street address.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address
{
	private String locationName;
	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String zip;
	
	/**
	 * Retrieves the name of the entity located at this address. Null values are allowed.
	 * 
	 * @return
	 */
	public String getLocationName()
	{
		return locationName;
	}
	
	/**
	 * Sets the name of the entity located at this address. Null values are allowed.
	 * 
	 * @param locationName
	 */
	public void setLocationName(String locationName)
	{
		this.locationName = locationName;
	}
	
	/**
	 * Returns the first line of the address - typically the number and street name.
	 * Null values are allowed.
	 * 
	 * @return
	 */
	public String getLine1()
	{
		return line1;
	}
	
	/**
	 * Sets the first line of the address - typically the number and street name.
	 * Null values are allowed.
	 * 
	 * @param line1
	 */
	public void setLine1(String line1)
	{
		this.line1 = line1;
	}
	
	/**
	 * Returns the second line of the address - typically a room, suite, or apartment
	 * number. Null values are allowed.
	 * 
	 * @return
	 */
	public String getLine2()
	{
		return line2;
	}
	
	/**
	 * Sets the second line of the address - typically a room, suite, or apartment
	 * number. Null values are allowed.
	 * 
	 * @param line2
	 */
	public void setLine2(String line2)
	{
		this.line2 = line2;
	}
	
	/**
	 * Returns the third line of the address. Null values are allowed.
	 * 
	 * @return
	 */
	public String getLine3()
	{
		return line3;
	}
	
	/**
	 * Sets the third line of the address. Null values are allowed.
	 * 
	 * @param line3
	 */
	public void setLine3(String line3)
	{
		this.line3 = line3;
	}
	
	/**
	 * Returns the name of the city containing this address. Null values are allowed.
	 * 
	 * @return
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Sets the name of the city containing this address. Null values are allowed.
	 * 
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Returns the name of the state containing this address. Null values are allowed.
	 * 
	 * @return
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * Sets the name of the state containing this address. Null values are allowed.
	 * 
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * Returns the simple zip code associated with this address. Null values are allowed.
	 * 
	 * @return
	 */
	public String getZip()
	{
		return zip;
	}
	
	/**
	 * Sets the simple zip code associated with this address. Null values are allowed.
	 * 
	 * @param zip
	 */
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("locationName", locationName)
				.append("line1", line1)
				.append("line2", line2)
				.append("line3", line3)
				.append("city", city)
				.append("state", state)
				.append("zip", zip)
				.toString();
	}

}

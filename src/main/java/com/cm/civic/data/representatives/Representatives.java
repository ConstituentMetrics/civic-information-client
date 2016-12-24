package com.cm.civic.data.representatives;

import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents various
 * information corresponding to one or more elected officials.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Representatives
{
	private Map<String, SimpleDivision> divisions;
	private Office[] offices;
	private Official[] officials;
	
	/**
	 * Returns a map of SimpleDivisions that contains geographical information corresponding to the
	 * representatives included in this object. Null values are allowed.
	 * 
	 * @return
	 */
	public Map<String, SimpleDivision> getDivisions()
	{
		return divisions;
	}
	
	/**
	 * Sets the SimpleDivision map containing geographical information corresponding to the representatives
	 * included in this object. Null values are allowed.
	 * 
	 * @param divisions
	 */
	public void setDivisions(Map<String, SimpleDivision> divisions)
	{
		this.divisions = divisions;
	}
	
	/**
	 * Returns an array of Offices referenced by the SimpleDivisions contained in this object.
	 * Null values are allowed.
	 * 
	 * @return
	 */
	public Office[] getOffices()
	{
		return offices;
	}
	
	/**
	 * Sets the array of Offices referenced by the SimpleDivisions contained in this object.
	 * Null values are allowed.
	 * 
	 * @param offices
	 */
	public void setOffices(Office[] offices)
	{
		this.offices = offices;
	}
	
	/**
	 * Returns an array of Officials holding the Offices contained in this object. Null values are allowed.
	 * 
	 * @return
	 */
	public Official[] getOfficials()
	{
		return officials;
	}
	
	/**
	 * Sets the array of Officials holding the Offices contained in this object. Null values are allowed.
	 * 
	 * @param officials
	 */
	public void setOfficials(Official[] officials)
	{
		this.officials = officials;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("divisions", divisions)
				.append("offices", offices)
				.append("officials", officials)
				.toString();
	}

}

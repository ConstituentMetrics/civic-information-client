package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents a data source
 * for a particular office.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Source
{
	private String name;
	private boolean official;
	
	/**
	 * Returns the name of this data source.  Null values are allowed.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of this data source. Null values are allowed.
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns true if this represents an official government source.
	 * 
	 * @return
	 */
	public boolean getOfficial()
	{
		return official;
	}
	
	/**
	 * Sets the value indicating whether this represents an official government source.
	 * 
	 * @param official
	 */
	public void setOfficial(boolean official)
	{
		this.official = official;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("name", name)
				.append("official", official)
				.toString();
	}

}

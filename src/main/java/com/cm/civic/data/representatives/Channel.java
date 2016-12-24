package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents
 * a reference to a social media account name.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel
{
	private String type;
	private String id;
	
	/**
	 * Returns the name of the social media platform this account belongs to. Null values are allowed.
	 * 
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Sets the name of the social media platform this account belongs to. Null values are allowed.
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * Returns the id for this social media account. Null values are allowed.
	 * 
	 * @return
	 */
	public String getId()
	{
		return id;
	}
	
	/**
	 * Sets the id for this social media account. Null values are allowed.
	 * 
	 * @param id
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("type", type)
				.append("id", id)
				.toString();
	}

}

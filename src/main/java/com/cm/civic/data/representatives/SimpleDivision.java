package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents a geographical area
 * represented by or presided over by an elected official.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleDivision
{
	private String name;
	private String[] alsoKnownAs;
	private int[] officeIndices;
	
	/**
	 * Returns the human-readable name of this division. Null values are allowed.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the human-readable name of this division. Null values are allowed.
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns an array of Open Civic Data identifiers that refer to the same division or other divisions whose
	 * boundaries are defined to be coterminous with this one. Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getAlsoKnownAs()
	{
		return alsoKnownAs;
	}
	
	/**
	 * Sets an array of Open Civic Data identifiers that refer to the same division or other divisions whose
	 * boundaries are defined to be coterminous with this one. Null values are allowed.
	 * 
	 * @param alsoKnownAs
	 */
	public void setAlsoKnownAs(String[] alsoKnownAs)
	{
		this.alsoKnownAs = alsoKnownAs;
	}
	
	/**
	 * Returns an array of indices in the offices array of offices elected from this division. Null values are allowed.
	 * 
	 * @return
	 */
	public int[] getOfficeIndices()
	{
		return officeIndices;
	}
	
	/**
	 * Sets an array of indices in the offices array of offices elected from this division. Null values are allowed.
	 * 
	 * @param officeIndices
	 */
	public void setOfficeIndices(int[] officeIndices)
	{
		this.officeIndices = officeIndices;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("name", name)
				.toString();
	}

}

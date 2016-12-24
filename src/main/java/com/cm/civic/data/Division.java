package com.cm.civic.data;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents a geographical area
 * represented by or presided over by an elected official, including the area's Open Civic Data identifier.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Division
{
	/**
	 * The unique Open Civic Data identifier assigned to this Division with the following format:
	 * <pre>
	 * {@code ocd-division/country:<country_code>[<type>:type_id>]+}
	 * 
	 * Example: ocd-division/country:us/state:ok/place:norman/ward:4
	 * </pre>
	 */
	private String ocdId;
	
	/**
	 * The human-readable Open Civic Data name assigned to this division.
	 * <pre>
	 * Example: Norman OK Ward 4
	 * </pre>
	 */
	private String name;
	
	/**
	 * An array of Open Civic Data identifiers that refer to the same division or other divisions whose
	 * boundaries are defined to be coterminous with this one. For example:
	 * <pre>
	 * Division: ocd-division/country:us/state:ny/borough:staten_island
	 * Alias(es): { ocd-division/country:us/state:ny/county:richmond }
	 * </pre>
	 */
	private String[] aliases;
	
	/**
	 * Returns the unique Open Civic Data identifier assigned to this Division. Null values are allowed.
	 * 
	 * @return
	 */
	public String getOcdId()
	{
		return ocdId;
	}

	/**
	 * Sets the unique Open Civic Data identifier assigned to this Division. Null values are allowed.
	 * 
	 * @param ocdId
	 */
	public void setOcdId(String ocdId)
	{
		this.ocdId = ocdId;
	}

	/**
	 * Returns the human-readable Open Civic Data identifier assigned to this Division. Null values are allowed.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the human-readable Open Civic Data identifier assigned to this Division. Null values are allowed.
	 * 
	 * @param ocdId
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
	public String[] getAliases()
	{
		return aliases;
	}

	/**
	 * Sets an array of Open Civic Data identifiers that refer to the same division or other divisions whose
	 * boundaries are defined to be coterminous with this one. Null values are allowed.
	 * 
	 * @param aliases
	 */
	public void setAliases(String[] aliases)
	{
		this.aliases = aliases;
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("ocdId", ocdId)
				.append("name", name)
				.toString();
	}

}

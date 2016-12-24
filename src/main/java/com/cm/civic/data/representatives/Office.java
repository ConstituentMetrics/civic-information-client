package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents an elected office.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Office {

	private String name;
	private String divisionId;
	private String[] levels;
	private String[] roles;
	private Source[] sources;
	private int[] officialIndices;
	
	/**
	 * Returns the name of this office. Null values are allowed.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of this office. Null values are allowed.
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns the Open Civic Data identifier of the division with which this office is
	 * associated. Null values are allowed.
	 * 
	 * @return
	 */
	public String getDivisionId()
	{
		return divisionId;
	}
	
	/**
	 * Sets the Open Civic Data identifier of the division with which this office is
	 * associated. Null values are allowed.
	 * 
	 * @param divisionId
	 */
	public void setDivisionId(String divisionId)
	{
		this.divisionId = divisionId;
	}
	
	/**
	 * Returns the levels of government of which this office is part. There may be more
	 * than one in cases where a jurisdiction effectively acts at two different levels of
	 * government; for example, the mayor of the District of Columbia acts at "locality"
	 * level, but also effectively at both administrativeArea2 and administrativeArea1.
	 * Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getLevels()
	{
		return levels;
	}
	
	/**
	 * Sets the levels of government of which this office is part. Null values are allowed.
	 * 
	 * @param levels
	 */
	public void setLevels(String[] levels)
	{
		this.levels = levels;
	}
	
	/**
	 * Returns the roles which this office fulfills. Roles are not meant to be exhaustive,
	 * or to exactly specify the entire set of responsibilities of a given office, but are
	 * meant to be rough categories that are useful for general selection from or sorting
	 * of a list of offices. Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getRoles()
	{
		return roles;
	}
	
	/**
	 * Sets the roles which this office fulfills. Null values are allowed.
	 * 
	 * @param roles
	 */
	public void setRoles(String[] roles)
	{
		this.roles = roles;
	}
	
	/**
	 * Returns an array of sources for this office. If multiple sources are listed, the data
	 * has been aggregated from those sources. Null values are allowed.
	 * 
	 * @return
	 */
	public Source[] getSources()
	{
		return sources;
	}
	
	/**
	 * Sets the sources for this office. Null values are allowed.
	 * 
	 * @param sources
	 */
	public void setSources(Source[] sources)
	{
		this.sources = sources;
	}
	
	/**
	 * Returns an array of indices in the officials array of people who presently hold this
	 * office. Null values are allowed.
	 * 
	 * @return
	 */
	public int[] getOfficialIndices()
	{
		return officialIndices;
	}
	
	/**
	 * Sets the indices in the officials array of people who presently hold this
	 * office. Null values are allowed.
	 *  
	 * @param officialIndices
	 */
	public void setOfficialIndices(int[] officialIndices)
	{
		this.officialIndices = officialIndices;
	}

	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("name", name)
				.toString();
	}

}

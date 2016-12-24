package com.cm.civic.data.representatives;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents an elected official.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Official
{
	private String name;
	private Address[] address;
	private String party;
	private String[] phones;
	private String[] urls;
	private String photoUrl;
	private String[] emails;
	private Channel[] channels;
	
	/**
	 * Returns the name of this official. Null values are allowed.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of this official. Null values are allowed.
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns the addresses at which this official can be contacted. Null values are allowed.
	 * 
	 * @return
	 */
	public Address[] getAddress()
	{
		return address;
	}
	
	/**
	 * Sets the addresses at which this official can be contacted. Null values are allowed.
	 * 
	 * @param address
	 */
	public void setAddress(Address[] address)
	{
		this.address = address;
	}
	
	/**
	 * Returns the full name of the party this official belongs to. Null values are allowed.
	 * 
	 * @return
	 */
	public String getParty()
	{
		return party;
	}
	
	/**
	 * Sets the full name of the party this official belongs to. Null values are allowed.
	 * 
	 * @param party
	 */
	public void setParty(String party)
	{
		this.party = party;
	}
	
	/**
	 * Returns this official's public contact phone numbers. Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getPhones()
	{
		return phones;
	}
	
	/**
	 * Sets this official's public contact phone numbers. Null values are allowed.
	 * 
	 * @param phones
	 */
	public void setPhones(String[] phones)
	{
		this.phones = phones;
	}
	
	/**
	 * Returns this official's public website URL's. Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getUrls()
	{
		return urls;
	}
	
	/**
	 * Sets this official's public website URL's. Null values are allowed.
	 * 
	 * @param urls
	 */
	public void setUrls(String[] urls)
	{
		this.urls = urls;
	}
	
	/**
	 * Returns a URL of a photo for this official. Null values are allowed.
	 * 
	 * @return
	 */
	public String getPhotoUrl()
	{
		return photoUrl;
	}
	
	/**
	 * Sets the URL of a photo for this official. Null values are allowed.
	 * 
	 * @param photoUrl
	 */
	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}
	
	/**
	 * Returns the direct email addresses of this official. Null values are allowed.
	 * 
	 * @return
	 */
	public String[] getEmails()
	{
		return emails;
	}
	
	/**
	 * Sets the direct email addresses of this official. Null values are allowed.
	 * 
	 * @param emails
	 */
	public void setEmails(String[] emails)
	{
		this.emails = emails;
	}
	
	/**
	 * Returns an array of known social media channels for this official. Null values are allowed.
	 * 
	 * @return
	 */
	public Channel[] getChannels()
	{
		return channels;
	}
	
	/**
	 * Sets an array of known social media channels for this official. Null values are allowed.
	 * 
	 * @param channels
	 */
	public void setChannels(Channel[] channels)
	{
		this.channels = channels;
	}

	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("name", name)
				.append("party", party)
				.toString();
	}

}

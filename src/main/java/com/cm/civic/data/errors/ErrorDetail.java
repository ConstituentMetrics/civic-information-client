package com.cm.civic.data.errors;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents the details of an error.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetail
{
	private String domain;
	private String reason;
	private String message;
	private String locationType;
	private String location;
	
	public String getDomain()
	{
		return domain;
	}

	public void setDomain(String domain)
	{
		this.domain = domain;
	}

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getLocationType()
	{
		return locationType;
	}

	public void setLocationType(String locationType)
	{
		this.locationType = locationType;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("reason", reason)
				.append("message", message)
				.toString();
	}

}

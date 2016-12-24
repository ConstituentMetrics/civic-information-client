package com.cm.civic.data.errors;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Describes a JSON object in the Google Civic Information API that represents an error.
 * 
 * @author jmoser
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error
{
	private ErrorDetail[] errors;
	private String code;
	private String message;
	
	public ErrorDetail[] getErrors()
	{
		return errors;
	}
	
	public void setErrors(ErrorDetail[] errors)
	{
		this.errors = errors;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
				.append("code", code)
				.append("details", errors)
				.toString();
	}

}

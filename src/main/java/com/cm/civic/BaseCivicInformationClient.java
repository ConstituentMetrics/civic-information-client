package com.cm.civic;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.cm.civic.properties.CIPropertyReader;

public class BaseCivicInformationClient
{
	protected static final String API_URL = "https://www.googleapis.com/civicinfo/v2/";
	
	private final CIPropertyReader properties;
	protected final String apiKey;
	
	public BaseCivicInformationClient()
	{
		this.properties = new CIPropertyReader();
		this.apiKey = properties.getProperty("apiKey");
	}
	
	protected String getApiKey()
	{
		return apiKey;
	}
	
	protected String encodeString(String inputString)
	{
		String encodedString = "";
		try
		{
			encodedString = URLEncoder.encode(inputString, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		return encodedString;
	}
}

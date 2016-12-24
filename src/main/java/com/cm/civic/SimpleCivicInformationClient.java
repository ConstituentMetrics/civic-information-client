package com.cm.civic;

import org.apache.commons.lang3.Validate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.cm.civic.data.representatives.Representatives;

public class SimpleCivicInformationClient extends BaseCivicInformationClient implements CivicInformationClient
{
	private final RestTemplate restTemplate;
	
	public SimpleCivicInformationClient()
	{
		super();
		
		this.restTemplate = new RestTemplateBuilder().build();
	}
	
	@Override
	public Representatives representativeInfoByAddress(String address)
	{
		Validate.notEmpty("Address must not be empty or null!");
		
		String methodUrl = API_URL.concat("representatives?address={address}&key={apiKey}");
		
		Representatives info = restTemplate.getForObject(methodUrl, Representatives.class, encodeString(address), getApiKey());
		
		return info;
	}

	@Override
	public Representatives representativeInfoByAddress(String address, boolean includeOffices)
	{
		Validate.notEmpty("Address must not be empty or null!");
		
		String methodUrl = API_URL.concat("representatives?address={address}&includeOffices={includeOffices}&key={apiKey}");
		
		Representatives info = restTemplate.getForObject(methodUrl, Representatives.class, encodeString(address), includeOffices, getApiKey());
		
		return info;
	}

}

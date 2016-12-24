package com.cm.civic;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cm.civic.data.representatives.Representatives;
import com.cm.civic.data.representatives.SimpleDivision;

@SpringBootApplication
public class SimpleCivicInformationService
{

	private static final Logger log = LoggerFactory.getLogger(SimpleCivicInformationService.class);
	
	public static void main(String[] args)
	{
		SpringApplication.run(SimpleCivicInformationService.class, args);
	}
	
	@Bean
	public CommandLineRunner run() throws Exception
	{
		CivicInformationClient consumer = new SimpleCivicInformationClient();
		Representatives info = consumer.representativeInfoByAddress("2300 N Lincoln Blvd, Oklahoma City, OK, 73105", false);
		
		return args -> {
			log.info(info.toString());
			Map<String, SimpleDivision> divisions = info.getDivisions();
			for(String currentKey : divisions.keySet())
			{
				log.info(currentKey);
			}
		};
	}
}

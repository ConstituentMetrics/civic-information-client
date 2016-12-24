package com.cm.civic.properties;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.junit.Assert;
import org.junit.Test;

public class CIPropertyReaderTests
{
	@Test
	public void testGetProperty()
	{
		ResourceBundle bundle = null;
		try
		{
			bundle = ResourceBundle.getBundle(CIPropertyReader.CI_PROPERTIES);
		}
		catch (NullPointerException e)
		{
			// TEST #1: VALUE OF CIPropertyReader.CI_PROPERTIES MUST NOT BE NULL
			Assert.fail("CIPropertyReader.CI_PROPERTIES is set to null! Must be set to name of properties file used "
					+ "by CivicInformationClient implementations (excluding the '.properties' extenstion)!");
		}
		catch (MissingResourceException e)
		{
			// TEST #2: PROPERTIES FILE MUST EXIST ON THE CLASSPATH
			Assert.fail("Properties file with the name [CIPropertyReader.CI_PROPERTIES].properties must exist on the classpath!");
		}

		// TEST #3: RESOURCE BUNDLE MUST NOT BE NULL
		Assert.assertNotNull(bundle);
		
		for (CIProperty current : CIProperty.values())
		{
			String key = current.getKey();
			
			// TEST #4: CONFIRM ALL ENUMERATED PROPERTIES EXIST
			boolean keyExists = bundle.containsKey(key);
			Assert.assertTrue("Properties file must contain key named [" + key + "]!", keyExists);
			
			// TEST #5: CONFIRM ALL ENUMERATED PROPERTIES HAVE NON-NULL VALUES
			String value = bundle.getString(key);
			Assert.assertNotNull("Value of property [" + key + "] must not be null!", value);
			
			// TEST #6: CONFIRM ALL ENUMERATED PROPERTIES HAVE NON-EMPTY VALUES
			Assert.assertTrue("Value of property [" + key + "] must not be empty or contain all whitespace!", value.trim().length() > 0);
		}
	}
}

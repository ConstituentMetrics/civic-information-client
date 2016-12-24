package com.cm.civic;

import com.cm.civic.data.representatives.Representatives;

/**
 * Describes a client that consumes the Google Civic Information API.
 * 
 * @author jmoser
 *
 */
public interface CivicInformationClient
{
	/**
	 * Returns a Representatives resource containing division, office, and official data for all
	 * political geographical divisions of which the provided address is a part.
	 * 
	 * @param address
	 * @return
	 */
	public Representatives representativeInfoByAddress(String address);
	
	/**
	 * Returns a Representatives resource containing division, office, and official data for all
	 * political geographical divisions of which the provided address is a part. If the value
	 * of the includeOffices parameter is false, then only divisions are returned.
	 * 
	 * @param address
	 * @param includeOffices
	 * @return
	 */
	public Representatives representativeInfoByAddress(String address, boolean includeOffices);
}

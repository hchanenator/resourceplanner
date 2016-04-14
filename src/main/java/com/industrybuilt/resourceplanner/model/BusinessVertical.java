/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

/**
 * @author hchan
 *
 */
public enum BusinessVertical {
	JUSTFOOD("JF"),
	EQUIPSOFT("ES");
	
	private final String shortName;
	
	private BusinessVertical(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
}

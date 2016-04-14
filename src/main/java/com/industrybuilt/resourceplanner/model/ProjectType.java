/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

/**
 * @author hchan
 *
 */
public enum ProjectType {
	FIXED_FEE("FF", "Fixed Fee"),
	TIME_MATERIALS("TM", "Time & Materials");
	
	private final String shortName;
	private final String description;
	
	private ProjectType(String shortName, String description) {
		this.shortName = shortName;
		this.description = description;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
		
}

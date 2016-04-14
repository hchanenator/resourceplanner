/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

/**
 * @author hchan
 *
 */
public enum ResourceType {
	
	BUSINESS_ANALYST("BA", "Business Analyst"),
	PROJECT_MANAGER("PM", "Project Manager");

	private final String shortDesc;
	private final String longDesc;
	
	ResourceType(String shortDesc, String longDesc) {
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
	
	public String getShortDesc() { return shortDesc; }
	public String getLongDesc() { return longDesc; }
}

/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

/**
 * @author hchan
 *
 */
public enum EventType {

	DISCOVERY("DISC", "Kick-off and Discovery"),
	CORE_TEAM_TRAINING("CTT", "Core Team Training"),
	BUSINESS_EVENT("BE", "Business Event/Test Script Session"),
	PILOT_TESTING("PT", "Pilot Testing"),
	GO_LIVE("GL", "Go Live"),
	POST_LIVE_SUPPORT("PL", "Post-Live Support");
	
	private final String shortName;
	private final String description;
	
	private EventType(String shortName, String description) {
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

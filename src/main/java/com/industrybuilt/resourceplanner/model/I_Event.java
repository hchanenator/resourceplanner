/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

import java.awt.Color;
import java.util.List;

/**
 * @author hchan
 *
 */
public interface I_Event {

	EventType getEventType();
	void setEventColor(Color color);
	Color getEventColor();
	List<Resource> getAssignedResources();
	void assignResource(Resource resource);
}

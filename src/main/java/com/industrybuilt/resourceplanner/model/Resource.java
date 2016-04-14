/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

import org.springframework.stereotype.Component;

/**
 * @author hchan
 *
 *
 */
@Component
public class Resource implements I_Resource {
	private String firstName;
	private String lastName;
	private ResourceType resourceType;
	
	public Resource() {
		this(null, null, null);
	}
	
	public Resource(String firstName, String lastName, ResourceType resourceType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.resourceType = (null == resourceType) ? ResourceType.BUSINESS_ANALYST : resourceType;
	}

	public void setFirstName(String firsName) { this.firstName = firstName; }
	public String getFirstName() { return firstName; }

	public void setLastName(String lastName) { this.lastName = lastName; }
	public String getLastName() { return lastName; }

	public String getInitials() { return firstName.substring(0, 1).concat(lastName.substring(0, 1).toUpperCase()); }

	public void setResourceType(ResourceType resourceType) { this.resourceType = resourceType; }
	public ResourceType getResourceType() { return resourceType; }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Resource [firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", ResourceType=" + getResourceType().getShortDesc() + "]";
	}

	

}

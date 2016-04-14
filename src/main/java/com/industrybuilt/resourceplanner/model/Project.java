/**
 * 
 */
package com.industrybuilt.resourceplanner.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author hchan
 *
 */
@Component
public class Project implements I_Project {

	private String projectName = "";
	private String projectID = "";
	private final List<Resource> resources = new ArrayList<Resource>();
}

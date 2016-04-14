package com.industrybuilt.resourceplanner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.industrybuilt.config.ResourcePlannerConfig;
import com.industrybuilt.resourceplanner.model.I_Resource;
import com.industrybuilt.resourceplanner.model.Resource;
import com.industrybuilt.resourceplanner.model.ResourceType;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ResourcePlannerConfig.class})
public class ResourcePlannerAppTest {
	
	@Autowired
	I_Resource resource;
	
	private Resource res = new Resource("Herb", "Chan", ResourceType.PROJECT_MANAGER);
    
	@Test
	public void checkResourceNotNull() {
		assertNotNull(resource);
	}
	
	@Test
	public void checkInitials() {		
		System.out.printf("%s\n", res.getInitials());		
	}
	
	@Test
	public void checkResourceType() {
		assertEquals(ResourceType.BUSINESS_ANALYST, resource.getResourceType());
	}
	
	@Test
	public void checkResource() {
		System.out.printf("%s\n", res.toString());
		
	}
}

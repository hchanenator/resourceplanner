/**
 * 
 */
package com.industrybuilt.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hchan
 *
 */
@Configuration
@ComponentScan(basePackages={"com.industrybuilt.resourceplanner"})
public interface ResourcePlannerConfig {

}

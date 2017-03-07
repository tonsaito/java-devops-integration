package br.com.devops.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfiguration extends ResourceConfig{
	
	
	public ResourceConfiguration(){
		packages("br.com.devops.api");
	}
	
}

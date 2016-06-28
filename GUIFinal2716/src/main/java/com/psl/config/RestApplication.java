package com.psl.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.psl.rest.resource.PersonResource;

//This will be the base path for all the resources in JAX-RS
//So for ex: when accessing HelloResource, the URL will be:
// http://server-ip:port/context-root/resource/hello

@ApplicationPath("/resource")
public class RestApplication extends Application{
	
	//By Overriding this method, we need to return 
	//the list of all Resource class we have created 
	//Not required in jersey by default
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();;
		classes.add(PersonResource.class);
		return classes;
	}
}

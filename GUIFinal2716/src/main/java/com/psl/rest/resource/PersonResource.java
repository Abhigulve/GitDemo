package com.psl.rest.resource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.psl.bean.LatLong;


	@Path("/person")
	public class PersonResource {
	 
	    private static Set<LatLong> latLongList = new HashSet<LatLong>();
	     
	    // The @Context annotation allows us to have certain contextual objects
	    // injected into this class.
	    // UriInfo object allows us to get URI information (no kidding).
	    @Context
	    UriInfo uriInfo;
	 
	    // Another "injected" object. This allows us to use the information that's
	    // part of any incoming request.
	    // We could, for example, get header information, or the requestor's address.
	    @Context
	    Request request;
	     
	
	
	    //sample path = <http://localhost:8080/JavaRestDemo/resource/person/addGeolocation>
	    @POST
	    @Path("/addGeolocation")
	    @Produces(MediaType.APPLICATION_JSON) //-->returning /exposing data in different representation like json, xml, plain text etc
	    @Consumes(MediaType.APPLICATION_JSON) //--->Taking/Getting data in different representation like json, xml, plain text etc
	    public  LatLong addGeoLocation(LatLong latLong) {
	    	System.out.println("Geolocation information="+latLong);
	    	/*latLong.setCustomerId("MYCUTID12345");*/
	    	
	    	latLongList.add(latLong);
	    	if(latLongList.size()==100) {
	    		latLongList.clear();
	    	}
	        return latLong;
	    }
	    
	    @GET
	    @Path("/getGeolocation")
	    @Produces(MediaType.APPLICATION_JSON)
	    public LatLong getGeoLocation(@QueryParam("customerId") String customerId) {
	    	/*LatLong latLong = latLongList.get(latLongList.size()-1);
	    	if(latLong.getCustomerId().equals(customerId)) {
	    		System.out.println("customer id get matched");
	    		return latLong;
	    	}
	    	return latLong;*/
	    	return null;
	    }
	    
	}

package com.uranos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ws/test")
public class ContactResource {
	
	@GET()	
	@Produces("text/plain")
	public String sayHello() {
	  System.out.println("Where is this getting written");
	  return "Hello World In Both Places";
	}
}

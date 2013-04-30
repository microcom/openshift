package com.uranos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ws/test")
public class ContactResource {
	
	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public Contact sayHello() {
	  Contact c = new Contact();
	  c.setNom("S");
	  c.setProvince("Qc");
	  return c;
	}
}

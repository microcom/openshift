package com.uranos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

@Path("/ws/test")
public class ContactResource {
	
	@GET()
	@CrossOriginResourceSharing(allowAllOrigins = true)
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Contact sayHello() {
	  Contact c = new Contact();
	  c.setNom("Stéphane");
	  c.setPrenom("Le Cornec");
	  c.setProvince("Québec");
	  c.setRue("Jean-Talon");
	  c.setVille("Montréal");
	  c.setCodePostal("H1P3C3");
	  return c;
	}
}

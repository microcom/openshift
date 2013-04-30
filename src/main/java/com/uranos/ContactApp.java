package com.uranos;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


public class ContactApp extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public ContactApp(){
	     singletons.add(new ContactResource());
	}
	@Override
	public Set<Class<?>> getClasses() {
	     return empty;
	}
	@Override
	public Set<Object> getSingletons() {
	     return singletons;
	}
}

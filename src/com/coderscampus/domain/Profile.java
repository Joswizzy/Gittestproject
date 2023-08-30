package com.coderscampus.domain;

//this is just a tutorial code for learning**

/**
 * BRANCHES:
 * "main"/"master" --> represents the code that's actually live on the internet 
 * 					  (e.g. coderscampus.com), typically pushed when code is revised
 * "QA"/"quality assurance" --> revisions done by devs
 * "UAT"/"user acceptance testing" (not typical) --> code gets delivered to selected customers FIRST
 * "development" --> the cutting edge of the app (most unstable-- hasn't been through revision)
 * 
 * 
 * ENVIRONMENTS:
 * "production" --> main/master
 */

public class Profile {
	private Integer id;
	private String name;
	private String url;


	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}

}
	
	

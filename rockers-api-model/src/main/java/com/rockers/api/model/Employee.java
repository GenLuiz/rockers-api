package com.rockers.api.model;
import lombok.Data;

@Data
public class Employee {

	private String id;
	private String name;
	private String wiproId;
	private String clientId;
	private String wiproEmail;
	private User user;
	private Contract contract;
	private Team team;
	
}

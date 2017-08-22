package com.rockers.api.model;
import java.util.Set;
import lombok.Data;

@Data
public class Team {

	private String id;
	private String name;
	private Set<Employee> employees;
}

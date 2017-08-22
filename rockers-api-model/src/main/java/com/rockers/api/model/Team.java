package com.rockers.api.model;
import java.util.List;
import lombok.Data;

@Data
public class Team {

	private String id;
	private String name;
	private List<Employee> employees;
}

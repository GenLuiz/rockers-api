package com.rockers.api.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Team extends BaseEntity{


	@Column(name="name", nullable=false, unique=false)
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Contract contract;
	
	@OneToMany(mappedBy="team", fetch=FetchType.LAZY)
	private List<Employee> listEmployees;
}

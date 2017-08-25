package com.rockers.api.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Employee extends BaseEntity{

	@Column(name="name", nullable=false, unique=false)
	private String name;
	
	@Column(name="wipro_id", nullable=false, unique=true)
	private String wiproId;
	
	@Column(name="client_id")
	private String clientId;
	
	@Column(name="wipro_email", nullable=false, unique=true)
	private String wiproEmail;
	
	@ManyToOne
	private Team team;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
}

package com.rockers.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Contract extends BaseEntity {

	@Column(name="name", nullable=false, unique=false)
	private String name;
	
	
}

package com.rockers.api.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Contract extends BaseEntity {

	@Column(name="name", nullable=false, unique=false)
	private String name;
	
	@OneToMany(mappedBy="contract", fetch=FetchType.LAZY)
	private List<Team> listTeam;
	
}

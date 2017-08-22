package com.rockers.api.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Employee;
import com.rockers.api.model.Team;

@Component
public class TeamDao implements Crud<Team>{

	@Override
	public Team findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Team t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			return "team Save";
		}else{
			return "team Update";
		}
	}

	@Override
	public List<Team> listAll() {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDao();
		List<Employee> listEmployee = dao.listAll();
		
		List<Team> listTeam = new ArrayList<Team>();
		
		Team team1 = new Team();
		team1.setId("1");
		team1.setName("ESS");
		team1.setEmployees(listEmployee);
		listTeam.add(team1);
		
		Team team2 = new Team();
		team2.setId("2");
		team2.setName("NON-COMMERCIAL");
		listTeam.add(team2);
		
		Team team3 = new Team();
		team3.setId("3");
		team3.setName("COMMERCIAL");
		listTeam.add(team3);
		
		return listTeam;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	
}

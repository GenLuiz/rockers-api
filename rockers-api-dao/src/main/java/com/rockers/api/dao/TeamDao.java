package com.rockers.api.dao;
import java.util.List;
import org.springframework.stereotype.Component;
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
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	
}

package com.rockers.api.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Team;
import com.rockers.api.repository.ITeamRepository;

@Component
public class TeamDao implements Crud<Team>{

	@Autowired
	ITeamRepository teamRepository; 
	
	@Override
	public Team findOne(Long id) {
		// TODO Auto-generated method stub
		return teamRepository.findOne(id);
	}

	@Override
	public String save(Team t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			teamRepository.save(t);
			return "team Save";
		}else{
			teamRepository.save(t);
			return "team Update";
		}
	}

	@Override
	public List<Team> listAll() {
		// TODO Auto-generated method stub
		return teamRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Team team = teamRepository.findOne(id);
		teamRepository.delete(team);
	}

	
}

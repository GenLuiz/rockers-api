package com.rockers.api.service.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rockers.api.dao.TeamDao;
import com.rockers.api.model.Team;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamDao dao;
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public ResponseEntity<String> saveTeam(@RequestBody Team team){
		String response = dao.save(team);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	public ResponseEntity<List<Team>> listTeam(){
		List<Team> response = dao.listAll();
		return new ResponseEntity<List<Team>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/find")
	public ResponseEntity<Team> findTeam(@RequestBody String id){
		Team team = dao.findOne(id);
		return new ResponseEntity<Team>(team,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/delete")
	public ResponseEntity<String> deleteTeam(@RequestBody String id){
		dao.delete(id);
		return new ResponseEntity<String>("OK",HttpStatus.OK);
	}
}

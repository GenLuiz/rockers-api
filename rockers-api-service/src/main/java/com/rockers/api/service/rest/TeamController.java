package com.rockers.api.service.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rockers.api.dao.TeamDao;
import com.rockers.api.model.Message;
import com.rockers.api.model.Team;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamDao dao;
	
	@RequestMapping(method=RequestMethod.POST, value="")
	public ResponseEntity<Message> saveTeam(@RequestBody Team team){
		String response = "";
		try{
			response = dao.save(team);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="")
	public ResponseEntity<Message> updateTeam(@RequestBody Team team){
		String response = "";
		try{
			response = dao.save(team);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="")
	public ResponseEntity<List<Team>> listTeam(){
		List<Team> response =  null;
		try{
			 response = dao.listAll();
		}catch(Exception e){}
		return new ResponseEntity<List<Team>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/{id}")
	public ResponseEntity<Team> findTeam(@PathVariable Long id){
		Team team = new Team();
		try{
			team = dao.findOne(id);
		}catch(Exception e){}
		return new ResponseEntity<Team>(team,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Message> deleteTeam(@PathVariable Long id){
		String response = "OK";
		try{
			dao.delete(id);
		}catch(Exception e){
			response = "Error";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
}

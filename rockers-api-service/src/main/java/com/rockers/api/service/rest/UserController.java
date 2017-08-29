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
import com.rockers.api.dao.UserDao;
import com.rockers.api.model.Message;
import com.rockers.api.model.User;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao dao;
	
	@RequestMapping(method=RequestMethod.POST,value="")
	public ResponseEntity<Message> saveUser(@RequestBody User user){
		String response = "";
		try{
			response = dao.save(user);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="")
	public ResponseEntity<Message> updateUser(@RequestBody User user){
		String response = "";
		try{
			response = dao.save(user);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="")
	public ResponseEntity<List<User>> listUser(){
		List<User> response =  null;
		try{
			 response = dao.listAll();
		}catch(Exception e){}
		return new ResponseEntity<List<User>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	public ResponseEntity<User> findUser(@PathVariable Long id){
		User user = new User();
		try{
			user = dao.findOne(id);
		}catch(Exception e){}
		if(user == null)
			return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public ResponseEntity<Message> deleteUser(@PathVariable Long id){
		String response = "OK";
		try{
			dao.delete(id);
		}catch(Exception e){
			response = "Error";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public ResponseEntity<Message> loginUser(@RequestBody User user){
		String response = dao.login(user);
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
}

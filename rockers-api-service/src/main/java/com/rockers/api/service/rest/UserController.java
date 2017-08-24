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
import com.rockers.api.model.User;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao dao;
	
	@RequestMapping(method=RequestMethod.POST,value="/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		String response = dao.save(user);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/list")
	public ResponseEntity<List<User>> listUser(){
		List<User> response =  dao.listAll();
		return new ResponseEntity<List<User>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/find/{id}")
	public ResponseEntity<User> findUser(@PathVariable String id){
		User user = dao.findOne(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id){
		dao.delete(id);
		return new ResponseEntity<String>("OK",HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public ResponseEntity<String> loginUser(@RequestBody User user){
		String response = dao.login(user);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}

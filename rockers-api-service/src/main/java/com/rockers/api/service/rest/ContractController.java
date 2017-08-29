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
import com.rockers.api.dao.ContractDao;
import com.rockers.api.model.Contract;
import com.rockers.api.model.Message;

@RestController
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractDao dao;
	
	
	@RequestMapping(method=RequestMethod.POST,value="")
	public ResponseEntity<Message> saveContract(@RequestBody Contract contract){
		String response = "";
		try{
			response = dao.save(contract);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="")
	public ResponseEntity<Message> updateContract(@RequestBody Contract contract){
		String response = "";
		try{
			response = dao.save(contract);
		}catch(Exception e){
			response = "Error occur";
		}
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="")
	public ResponseEntity<List<Contract>> listContract(){
		List<Contract> response = null;
		try{
			 response = dao.listAll();
		}catch(Exception e){
			
		}
		return new ResponseEntity<List<Contract>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	public ResponseEntity<Contract> findContract(@PathVariable Long id){
		Contract contract = new Contract();
		try{
			contract = dao.findOne(id);
		}catch(Exception e){}
		 
		return new ResponseEntity<Contract>(contract, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public ResponseEntity<Message> deleteContract(@PathVariable Long id){
		String response = "OK";
		try{
			dao.delete(id);
		}catch(Exception e){
			response = "Error";
		}
		
		return new ResponseEntity<Message>(new Message(response), HttpStatus.OK);
	}
	
}

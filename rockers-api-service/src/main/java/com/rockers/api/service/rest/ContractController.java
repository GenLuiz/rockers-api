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

@RestController
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractDao dao;
	
	@RequestMapping(method=RequestMethod.POST,value="/save")
	public ResponseEntity<String> saveContract(@RequestBody Contract contract){
		String response = dao.save(contract);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/list")
	public ResponseEntity<List<Contract>> listContract(){
		List<Contract> response = dao.listAll();
		return new ResponseEntity<List<Contract>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/find/{id}")
	public ResponseEntity<Contract> findContract(@PathVariable Long id){
		Contract contract = dao.findOne(id);
		return new ResponseEntity<Contract>(contract, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public ResponseEntity<String> deleteContract(@PathVariable Long id){
		dao.delete(id);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
}

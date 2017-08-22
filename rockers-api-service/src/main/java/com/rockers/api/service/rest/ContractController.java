package com.rockers.api.service.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockers.api.dao.ContractDao;
import com.rockers.api.model.Contract;

@RestController
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractDao dao;
	
	public ResponseEntity<String> saveContract(@RequestBody Contract contract){
		String response = dao.save(contract);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}

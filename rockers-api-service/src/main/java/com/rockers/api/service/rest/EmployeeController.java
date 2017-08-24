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

import com.rockers.api.dao.EmployeeDao;
import com.rockers.api.model.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		String response = dao.save(employee);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	public ResponseEntity<List<Employee>> listEmployee(){
		List<Employee> response = dao.listAll();
		return new ResponseEntity<List<Employee>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/find/{id}")
	public ResponseEntity<Employee> findEmployee(@PathVariable Long id){
		Employee employee = dao.findOne(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
		dao.delete(id);
		return new ResponseEntity<String>("OK",HttpStatus.OK);
	}
}

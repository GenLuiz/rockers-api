package com.rockers.api.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Employee;
import com.rockers.api.repository.IEmployeeRepository;

@Component
public class EmployeeDao implements Crud<Employee>{

	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee findOne(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	@Override
	public String save(Employee t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			employeeRepository.save(t);
			return "Employee save";
		}else{
			employeeRepository.save(t);
			return "Employee update";
		}
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub		
		return employeeRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findOne(id);
		employeeRepository.delete(employee);
	}

}

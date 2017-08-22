package com.rockers.api.dao;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Employee;

@Component
public class EmployeeDao implements Crud<Employee>{

	@Override
	public Employee findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Employee t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			return "Employee save";
		}else{
			return "Employee update";
		}
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

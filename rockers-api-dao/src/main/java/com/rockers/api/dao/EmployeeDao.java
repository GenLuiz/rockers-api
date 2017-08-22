package com.rockers.api.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Contract;
import com.rockers.api.model.Employee;
import com.rockers.api.model.User;

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
		UserDao dao = new UserDao();
		List<User> listUser = dao.listAll();
		
		ContractDao contractDao = new ContractDao();
		List<Contract> listContract = contractDao.listAll();
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setClientId("1");
		employee1.setId("1");
		employee1.setName("Luiz");
		employee1.setUser(listUser.get(0));
		employee1.setContract(listContract.get(0));
		employee1.setWiproEmail("luiz.barbosa@wipro.com");
		employee1.setWiproId("385647");
		listEmployee.add(employee1);
		
		Employee employee2 = new Employee();
		employee2.setClientId("1");
		employee2.setId("2");
		employee2.setName("Luiz barbosa");
		employee2.setUser(listUser.get(1));
		employee2.setContract(listContract.get(1));
		employee2.setWiproEmail("luiz.fernando@wipro.com");
		employee2.setWiproId("385647");
		listEmployee.add(employee2);
		
		return listEmployee;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

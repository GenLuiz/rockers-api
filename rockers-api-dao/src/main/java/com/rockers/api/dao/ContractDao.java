package com.rockers.api.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Contract;
import com.rockers.api.model.User;

@Component
public class ContractDao implements Crud<Contract> {

	@Override
	public Contract findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Contract t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			return "contract Save";
		}else{
			return "contract Update";
		}
	}

	@Override
	public List<Contract> listAll() {
		// TODO Auto-generated method stub
		
		UserDao dao = new UserDao();
		List<User> listUser = dao.listAll();
		
		List<Contract> listContract = new ArrayList<Contract>();
		
		Contract contract1 = new Contract();
		contract1.setId("1");
		contract1.setName("CLT");
		contract1.setUser(listUser.get(0));
		listContract.add(contract1);
		
	
		Contract contract2 = new Contract();
		contract2.setId("2");
		contract2.setName("PJ");
		contract2.setUser(listUser.get(1));
		listContract.add(contract2);
		
		return listContract;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

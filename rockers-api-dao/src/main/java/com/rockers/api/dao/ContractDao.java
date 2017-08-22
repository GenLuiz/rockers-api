package com.rockers.api.dao;
import java.util.List;

import com.rockers.api.model.Contract;

public class ContractDao implements Crud<Contract> {

	@Override
	public Contract findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Contract t) {
		// TODO Auto-generated method stub
		if(t.getId().equals(null)){
			return "contract Save";
		}else{
			return "contract Update";
		}
	}

	@Override
	public List<Contract> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

package com.rockers.api.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Contract;
import com.rockers.api.repository.IContractRepository;

@Component
public class ContractDao implements Crud<Contract> {

	@Autowired
	IContractRepository contractRepository;
	
	@Override
	public Contract findOne(Long id) {
		// TODO Auto-generated method stub
		return contractRepository.findOne(id);
	}

	@Override
	public String save(Contract t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			contractRepository.save(t);
			return "Contract Save";
		}else{
			contractRepository.save(t);
			return "contract Update";
		}
	}

	@Override
	public List<Contract> listAll() {
		// TODO Auto-generated method stub
		return contractRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Contract contract = contractRepository.findOne(id);
		contractRepository.delete(contract);
	}

}

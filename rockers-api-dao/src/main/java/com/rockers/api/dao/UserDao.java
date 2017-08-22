package com.rockers.api.dao;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.User;

@Component
public class UserDao implements Crud<User> {

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(User t) {
		// TODO Auto-generated method stub
		if(t.getId().equals(null)){
			return "User Save";
		}else{
			return "User Update";
		}
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}

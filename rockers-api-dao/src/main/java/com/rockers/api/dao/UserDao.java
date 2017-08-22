package com.rockers.api.dao;
import java.util.ArrayList;
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
		if(t.getId()== null){
			return "User Save";
		}else{
			return "User Update";
		}
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		List<User> listUser = new ArrayList<User>();
		
		User usuario1 = new User();
		usuario1.setId("1");
		usuario1.setLogin("123@123.com");
		usuario1.setPassword("1234");
		listUser.add(usuario1);
		
		User usuario2 = new User();
		usuario2.setId("2");
		usuario2.setLogin("1234@1234.com");
		usuario2.setPassword("1234");
		listUser.add(usuario2);
		
		return listUser;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}

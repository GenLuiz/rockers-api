package com.rockers.api.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rockers.api.model.User;
import com.rockers.api.repository.IUserRepository;

@Component
public class UserDao implements Crud<User> {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public String save(User t) {
		// TODO Auto-generated method stub
		if(t.getId()== null){
			userRepository.save(t);
			return "User Save";
		}else{
			userRepository.save(t);
			return "User Update";
		}
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findOne(id);
		userRepository.delete(user);
	}

	public String login(User user) {
		// TODO Auto-generated method stub
		return "Success";
	}
}

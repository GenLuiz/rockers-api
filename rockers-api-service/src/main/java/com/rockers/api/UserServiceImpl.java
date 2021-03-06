//package com.rockers.api;
//
//import com.rockers.api.model.User;
//import com.rockers.api.repository.IUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import java.util.Arrays;
//import java.util.Collection;
//
///**
// * Created by e068806 on 8/28/2017.
// */
//@Component(value = "userDetailService")
//public class UserServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private IUserRepository userRepository;
//
//    private Collection<SimpleGrantedAuthority> getAuthority() {
//        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        User user = userRepository.findByLogin(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("Invalid username or password");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), getAuthority());
//    }
//}
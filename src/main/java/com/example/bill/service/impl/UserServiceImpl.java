package com.example.bill.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.bill.model.User;
import com.example.bill.repository.UserRepository;
import com.example.bill.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean addUser(User user) {
		boolean userExists = userRepository.existsByAccountNum(user.getAccountNum());
		if(!userExists) {
			userRepository.save(user);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> getUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean updateUser(Long id,User user) {
		Optional<User> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			User userExists = existingUserOptional.get();
			
			userExists.setUserName(user.getUserName());
			userExists.setEmail(user.getEmail());
			userExists.setPassword(user.getPassword());
			userExists.setAccountNum(user.getAccountNum());
			userExists.setPhoneNum(user.getPhoneNum());
			userExists.setAddress(user.getAddress());
			userRepository.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
		Optional<User> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			userRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Page<User> getAllUser(PageRequest pageRequest){
		return userRepository.findAll(pageRequest);
	}
	@Override
	public List<User> findAllQuery(){
		return userRepository.findAllQuery();
	}
	@Override
	public User findByAccountNum(String accountNum) {
		return userRepository.findByAccountNum(accountNum);
	}
//
	@Override
	public User findByAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	

//	@Override
//	public User findByAccountNum(String accountNum) {
//		// TODO Auto-generated method stub
//		return null;
//	}



//	@Override
//	public User updateUserQuery(String name, Long transactionId) {
//		// TODO Auto-generated method stub
//		return userRepository.updateUserQuery();
//	}

	

	 

	

	

	

	

}
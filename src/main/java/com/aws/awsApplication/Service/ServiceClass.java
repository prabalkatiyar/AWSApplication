package com.aws.awsApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.aws.awsApplication.DAO.DaoInterface;
import com.aws.awsApplication.Entity.User;

@Service
public class ServiceClass {

	
	@Autowired
	DaoInterface dao;
	
	public String test()
	{
		return "Test Successful";
	}
	
	public User insertUser(User user) 
	{
		dao.save(user);
		return user;
	}
	
	public User getUser(int userId) 
	{
		User user=dao.findById(userId).get();
		return user;
	}
	
	
}

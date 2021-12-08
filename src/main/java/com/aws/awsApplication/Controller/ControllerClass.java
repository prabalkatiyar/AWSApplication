package com.aws.awsApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.awsApplication.DAO.DaoInterface;
import com.aws.awsApplication.Entity.User;
import com.aws.awsApplication.Service.ServiceClass;

@RestController()
public class ControllerClass {
	
	@Autowired
	ServiceClass service;
	
	@GetMapping("/test")
	public String test()
	{
		return service.test();
	}
	
	@PostMapping("/insertUser")
	public User insertUser(@RequestBody User user) 
	{
		return service.insertUser(user);
	}
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable int userId) 
	{
		return service.getUser(userId);
	}

}

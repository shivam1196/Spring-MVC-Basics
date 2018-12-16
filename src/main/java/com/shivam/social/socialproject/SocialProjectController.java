package com.shivam.social.socialproject;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.shivam.social.socialproject.users.Users;
import com.shivam.social.socialproject.users.UsersDAO;

@RestController
public class SocialProjectController {
	
	@Autowired
	private UsersDAO usersDao;
	
	
	@GetMapping(path="/social-project/getAllUser")
	public List<Users> getAllUser(){
		return usersDao.getAllUsers();
	}
	
	@GetMapping(path="/social-project/getUsers/{id}")
	public Users getOneUser(@PathVariable int id){
		return usersDao.getOneUser(id);
	}
	
	
	
	@PostMapping(path="/social-project/addUser")
	public ResponseEntity<Object> addUser(@RequestBody Users users){
		Users user=usersDao.addOneUser(users);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(user.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(path="/social-project/deleteUser/{id}")
	public void deleteUserById(@PathVariable int id){
		usersDao.deleteUser(id);
	}
	
	
	
	
	
	
	
	
	

}

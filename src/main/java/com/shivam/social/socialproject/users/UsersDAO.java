package com.shivam.social.socialproject.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsersDAO {
	
	private static List<Users> userList = new ArrayList<>();
	private static int userId=0;
	
	
	public Users addOneUser(Users users){
		users.setId(++userId);
		userList.add(users);
		return users;
		
	}
	
	
	
	public Users getOneUser(int id){
		for(Users users: userList){
			if(users.getId() == id){
				return users;
			}
			
		}
		
		return null;
	}
	
	
	
	public List<Users> getAllUsers(){
		if(userList.size()!=0)
		{
			return userList ;
		}
		
		return null;
		
	}
	public void deleteUser(int id){
		for(Users users : userList){
			if(users.getId() == id){
				userList.remove(users);
			}
		}
	}
	

}

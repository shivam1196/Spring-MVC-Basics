package com.shivam.social.socialproject.users;

public class Users {
	
	private String name ;
	private Integer id ;
	private String message;
	
	public Users(String name, int id, String message) {
		super();
		this.name = name;
		this.id = id;
		this.message = message;
	}
	
	
	protected Users (){
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", id=" + id + ", message=" + message + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
	
	
	

}

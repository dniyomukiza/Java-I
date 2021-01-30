package edu.institution;

public class UserAccount {
	
	//Fields
	
	private String username; 
	private String password; 
	
	//Overloaded constructor
	
	public UserAccount(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	
      // method that returns true if the argument is the same as this account’s password, 
	public boolean isPasswordCorrect (String pass) {
		if(pass.equals(this.password)) {
		return true; }
		
		else { 
			return false;
		}
		
	}
	//setters and getters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return  username ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
}

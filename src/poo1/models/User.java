package poo1.models;

import poo1.exception.BadPasswordException;

public class User extends Object{

	private String login;
	private String password;
	private Group group;
	private Organisation organisation;
	
	public User(String login,Group group) {
		this.login=login;
		this.group=group;
	}
	
	public User(Group group) {
		this("no lgin",group);

	}
	
	public String getlogin() {
		return this.login;
	}
	public void setlogin(String login) {
		this.login=login;
	}
	
	
	public void setPassword(String password,String conf) throws Exception {
		if(password==null || password.equals(this.password) ||!password.equals(conf)) {
			throw new BadPasswordException("bad new password");
		}
		this.password=password;
	}

	
	public Group getGroup() {
		return group;
		
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	public Organisation getOrganisation() {
		return organisation;
		
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	@Override
	public String toString() {
		if(group!=null) {
			return login+"("+group+")";
		}
		return login;
	}
}
package poo1.models;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private String name;
	private List<User> users;
	private Organisation organisation;
	
	public Group() {
		this("");
	}
	
	public Group(String name) {
		this.name=name;
		users=new ArrayList<User>(); //Creation d'une liste vide
		this.organisation = organisation;

	}
	
	public void addUser(User user) {
		user.setGroup(this);
		users.add(user);
	}
	
	public String getname() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	
	
	public List<User> getUsers() {
		return users;
	}
	
	public Organisation getOrganisation() {
		return organisation;
		
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	@Override
	public String toString() {
		return "Groupe [name=" + name + "]";
	}

}
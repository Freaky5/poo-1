package poo1.models;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

		private String name;
	
		private List<User> users;
	
		private List<Group> groups;
		
		
		
		public Organisation() {
			this("");
		}
	
		public Organisation(String name) {
			this.name=name;	
			groups=new ArrayList<Group>();
			users=new ArrayList<User>();
	
		}
		
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		
		public void addUser(User user) {
			user.setOrganisation(this);
			users.add(user);
		}
		
		public List<User> getUsers() {
			return users;
		}
		
		public void addGroup(Group group) {
			group.setOrganisation(this);
			groups.add(group);
		}
		
		public List<Group> getGroups() {
			return groups;
		}
		
}
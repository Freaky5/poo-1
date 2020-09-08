package poo1;

import poo1.exception.BadPasswordException;
import poo1.models.Group;
import poo1.models.User;

public class Test {

	public static void main(String[] args) {
		
		User u=new User();
		u.setlogin("hugo");
		System.out.println(u);
		
		try {
		u.setPassword("azerty", "azerty");
		System.out.println(u);
			}catch (Exception e) {
				if(e instanceof BadPasswordException) {
						System.out.println("mauvais mot de passe");
		}else {
			e.printStackTrace();
			}
		}
		Group g=new Group("sio");
		g.addUser(u);
		System.out.println(u);
	}

}
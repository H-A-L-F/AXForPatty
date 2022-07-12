package models;

import modules.GirlfriendState;
import source.GirlfriendStateNormal;

public class Girlfriend {
	private int day;
	private GirlfriendState state;
	
	
	public Girlfriend() {
		this.day = 1;
		this.state = new GirlfriendStateNormal();
	}
	
	void introduce() {
		System.out.println("Day: " + day);
		System.out.println("Yahallooo! What are we doing today?");
	}
	
	void activity() {
		
	}
}

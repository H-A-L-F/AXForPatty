package models;

import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Burger> burgers;
	private static Restaurant restaurantInstance;
	
	private Restaurant() {
		this.burgers = new ArrayList<Burger>();
	}
	
	public Restaurant getRestaurantInstance() {
		if(restaurantInstance == null) restaurantInstance = new Restaurant();
		return restaurantInstance;
	}
	
	public void addBurger(Burger burger) {
		this.burgers.add(burger);
	}
	
	public void removeBurger(Burger burger) {
		this.burgers.remove(burger);
	}
}

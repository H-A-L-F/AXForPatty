package modules;

import models.Burger;

public class BurgerBuilder {
	private Burger burger;

	public BurgerBuilder(Burger burger) {
		super();
		this.burger = burger;
	}
	
	public BurgerBuilder setPatty(int patty) {
		this.burger.setPatty(patty);
		return this;
	}
	
	public BurgerBuilder setCheese(int cheese) {
		this.burger.setCheese(cheese);
		return this;
	}
	
	public BurgerBuilder setBun(int bun) {
		this.burger.setBun(bun);
		return this;
	}
	
	public BurgerBuilder setVegetable(boolean val) {
		this.burger.setVegetable(val);
		return this;
	}
	
	public BurgerBuilder setPickle(boolean val) {
		this.burger.setPickle(val);
		return this;
	}
	
	public BurgerBuilder setSmash(boolean val) {
		this.burger.setSmash(val);
		return this;
	}
	
	public BurgerBuilder setName(String name) {
		this.burger.setName(name);
		return this;
	}
	
	public void reset() {
		this.burger = new Burger();
	}
	
	public Burger getBurger() {
		Burger temp = this.burger;
		this.reset();
		return temp;t
	}
}
package models;

import modules.RupiahAdapter;

public class Burger {
	private int patty;
	private int cheese;
	private int bun;
	private int price;
	private boolean vegetable;
	private boolean pickle;
	private boolean smash;
	private String name;
	
	public Burger() {
		super();
		this.patty = 1;
		this.cheese = 1;
		this.bun = 2;
		this.price = (patty * 10000) + (cheese * 5000) + (bun * 2000);
		this.vegetable = true;
		this.pickle = true;
		this.smash = false;
		this.name = "AXBurPatt";
	}

	public void viewBurger(Rupiah rupiah) {
		System.out.printf("=======================");
		System.out.printf("%10s: %s\n", "Name", name);
		System.out.printf("%10s: %d\n", "Bun", bun);
		System.out.printf("%10s: %d\n", "Pattty", patty);
		System.out.printf("%10s: %d\n", "Cheese", cheese);
		System.out.printf("%10s: %s\n", "Vegetable", vegetable ? "included" : "not included");
		System.out.printf("%10s: %s\n", "Pickle", pickle ? "included" : "not included");
		System.out.printf("%10s: %s\n", "Smash", smash ? "smash burger" : "normal burger");
		System.out.printf("%10s: %s %d\n", "Price", rupiah.getName(), rupiah.getAmount());
		System.out.println("=======================");
	}
	
	public void purchaseBurger(Rupiah rupiah) {
		if(rupiah.getAmount() > price) {
			System.out.println("Thankyou for your purchase!");
			System.out.printf("Your return is: %s %d\n", rupiah.getName(), rupiah.getAmount() - price);
		} else if(rupiah.getAmount() < price) {
			System.out.println("Sorry, that wasn't enough.");
			System.out.printf("You lack: %s %d\n", rupiah.getName(), price - rupiah.getAmount());
		} else {
			System.out.println("Thankyou for your purchase!");
		}
	}

	public int getPatty() {
		return patty;
	}

	public void setPatty(int patty) {
		this.patty = patty;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = (patty * 10000) + (cheese * 5000) + (bun * 2000);
	}

	public boolean isVegetable() {
		return vegetable;
	}

	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}

	public boolean isPickle() {
		return pickle;
	}

	public void setPickle(boolean pickle) {
		this.pickle = pickle;
	}

	public boolean isSmash() {
		return smash;
	}

	public void setSmash(boolean smash) {
		this.smash = smash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
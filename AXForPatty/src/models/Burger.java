package models;

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

	public void viewBurger() {
		System.out.printf("%10s: %s\n", "Name", name);
		System.out.printf("%10s: %d\n", "Bun", bun);
		System.out.printf("%10s: %d\n", "Pattty", patty);
		System.out.printf("%10s: %d\n", "Cheese", cheese);
		System.out.printf("%10s: %s\n", "Vegetable", vegetable ? "included" : "not included");
		System.out.printf("%10s: %s\n", "Pickle", pickle ? "included" : "not included");
		System.out.printf("%10s: %s\n", "Smash", smash ? "smash burger" : "normal burger");
		System.out.printf("%10s: IDR %d\n", "Price", price);
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
}

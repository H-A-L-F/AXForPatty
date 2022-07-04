package models;

public class Rupiah {
	private String name;
	private int amount;
	
	public Rupiah() {
		super();
		this.name = "IDR";
		this.amount = 0;
	}
	
	public Rupiah(int amount) {
		super();
		this.name = "IDR";
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

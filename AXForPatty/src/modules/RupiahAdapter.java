package modules;

import models.Rupiah;

public class RupiahAdapter extends Rupiah{
	private double multiplier;
	
	public RupiahAdapter(int amount) {
		super(amount);
		this.multiplier = 1;
	}
	
	@Override
	public int getAmount() {
		return (int) (super.getAmount() * multiplier);
	}
	
	public void setSGD() {
		this.setName("SGD");
		this.setMultiplier(1/10719);
	}
	
	public void setMYR() {
		this.setName("MYR");
		this.setMultiplier(1/3399);
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
}

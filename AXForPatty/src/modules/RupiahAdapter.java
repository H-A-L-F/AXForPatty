package modules;

import models.Rupiah;

public class RupiahAdapter extends Rupiah{
	private double multiplier;
	
	public RupiahAdapter() {
		super();
		this.multiplier = 1;
	}
	
	@Override
	public int getAmount() {
		return (int) (super.getAmount() * multiplier);
	}
	
	public void setSGD() {
		this.setName("SGD");
		this.setMultiplier((double)1/4);
	}
	
	public void setMYR() {
		this.setName("MYR");
		this.setMultiplier((double)1/2);
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
}

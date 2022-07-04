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
}

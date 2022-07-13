package modules;

import java.util.Random;

import models.Girlfriend;

public abstract class GirlfriendState {
	private Girlfriend girlfriend;
	private int stats[];
	
	public GirlfriendState(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
		this.stats = new int[5];
		
		generateStats(10);
	}
	
	public void generateStats(int points) {
		Random rand = new Random();
		for(int i = 0; i < stats.length; i++) {
			if(points > 0) {
				int temp = rand.nextInt(points);
				points -= temp;
				stats[i] = temp;
			} else {
				stats[i] = 0;
			}
		}
	}	
	
	public abstract void introduction();
	public abstract void action();
	public abstract void updateResource(String action);
	public abstract String response();
	
	public Girlfriend getGirlfriend() {
		return girlfriend;
	}

	public void setGirlfriend(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	public int[] getStats() {
		return stats;
	}

	public void setStats(int[] stats) {
		this.stats = stats;
	}
}

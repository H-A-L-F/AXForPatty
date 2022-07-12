package modules;

import java.util.Random;

import models.Girlfriend;

public abstract class GirlfriendState {
	Girlfriend girlfriend;
	int happinness;
	String loveLanguages[];
	int stats[];
	
	public GirlfriendState(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
		this.happinness = 0;
		this.loveLanguages = new String[5];
		this.stats = new int[5];
		
		generateLoveLanguage();
		generateStats(10);
	}
	
	public GirlfriendState() {
		
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
	
	public void generateLoveLanguage() {
		loveLanguages[0] = "Words of Affirmation";
		loveLanguages[1] = "Physical Touch";
		loveLanguages[2] = "Quality Time";
		loveLanguages[3] = "Giving and Receiving";
		loveLanguages[4] = "Act of Service";
	}
	
	public void printStats() {
		System.out.println("=== Girlfriend Stats ===");
		for(int i = 0; i < loveLanguages.length; i++) {
			System.out.printf("%d. %-20s: %d\n", i, loveLanguages[i], stats[i]);
		}
		System.out.println("========================");
	}
}

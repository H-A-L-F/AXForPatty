package source;

import java.util.Random;

import models.Actions;
import models.Girlfriend;
import modules.GirlfriendState;

public class GirlfriendStateNormal extends GirlfriendState {

	public GirlfriendStateNormal(Girlfriend girlfriend) {
		super(girlfriend);
		// TODO Auto-generated constructor stub
	}

	public void generateStats(int points) {
		Random rand = new Random();
		for(int i = 0; i < getStats().length; i++) {
			int temp = rand.nextInt(5 - (-2)) - 2;
			getStats()[i] = temp;
		}
	}
	
	public int processAction(String action) {
		int point = 0;
		
		for(int i = 0; i < Actions.ACTIONS.length; i++) {
			if(Actions.ACTIONS[i].equals(action)) point = getStats()[i];
		}s
		
		if(point < 0) {
			System.out.println("Girlfriend  : Hehehe... thankyouu...");
		} else if(point >= 0 && point < 3) {
			System.out.println("Girlfriend  : *GASP* Thankyou, dear.");
		} else if (point >= 3 && point <= 5){
			System.out.println("Girlfriend  : *GASP* Thankyou!!!");
		}
		
		return point;
	}
	
	public void printStats() {
		System.out.println("=== Girlfriend Stats ===");
		for(int i = 0; i < Actions.ACTIONS.length; i++) {
			System.out.printf("%d. %-20s: %d\n", i, Actions.ACTIONS[i], getStats()[i]);
		}
		System.out.println("========================");
	}
	
	public void addHappinness(int points) {
		getGirlfriend().addResource(points);
		
		if(getGirlfriend().getResource() == 0) {
			getGirlfriend().changeState(new GirlfriendStateAngry(getGirlfriend()));
		} else if(getGirlfriend().getResource() >= 10) {
			getGirlfriend().setResource(0);
			getGirlfriend().changeState(new GirlfriendStateHappy(getGirlfriend()));
		}
	}
	
	@Override
	public void introduction() {
		System.out.println("Girlfriend  : Yahallooo! What are we doing today?");
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateResource(String action) {
		System.out.printf("Player (you): *%s*\n", action);
		int point = processAction(action);
		addHappinness(point);
	}

	@Override
	public String response() {
		return "";
	}
}

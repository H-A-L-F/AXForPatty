package source;

import models.Girlfriend;
import modules.GirlfriendState;

public class GirlfriendStateHappy extends GirlfriendState {

	public GirlfriendStateHappy(Girlfriend girlfriend) {
		super(girlfriend);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void introduction() {
		System.out.println("I'm feeling very joly today <3");
	}

	@Override
	public void action() {
		System.out.println("I brought you a gift!");
	}

	@Override
	public void updateResource(String action) {
		System.out.println("Aww... thankyou darling!");
	}

	@Override
	public String response() {
		System.out.println("Congrats you have obtained a new girlfriend!");
		return "done";
	}

}

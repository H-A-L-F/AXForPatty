package source;

import models.Girlfriend;
import modules.GirlfriendState;

public class GirlfriendStateAngry extends GirlfriendState {

	public GirlfriendStateAngry(Girlfriend girlfriend) {
		super(girlfriend);
	}

	@Override
	public void introduction() {
		System.out.println("Hmph!");
	}

	@Override
	public void action() {
		System.out.println("...");
	}

	@Override
	public void updateResource(String action) {
		System.out.println("Hmph I need no such thing");
	}

	@Override
	public String response() {
		System.out.println("She ghosted you and never came back...");
		return "done";
	}

}

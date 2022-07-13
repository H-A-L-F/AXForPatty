package models;

import modules.GirlfriendState;
import modules.PlayerAi;
import source.GirlfriendStateNormal;

public class Girlfriend extends PlayerAi{
	private GirlfriendState state;
	
	public Girlfriend() {
		super(0);
		this.state = new GirlfriendStateNormal(this);
	}
	
	public void changeState(GirlfriendState newState) {
		this.state = newState;
	}

	@Override
	public void introduction() {
		state.introduction();
	}

	@Override
	public void action() {
		state.action();
	}

	@Override
	public void updateResource(String action) {
		state.updateResource(action);
	}
	
	@Override
	public String response() {
		return state.response();
	}
}

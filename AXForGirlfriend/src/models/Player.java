package models;

import modules.Input;
import modules.PlayerAi;

public class Player extends PlayerAi{
	private int day;
	private Input in;
	private String action;
	
	public Player() {
		super(0);
		this.day = 0;
		this.action = "";
	}
	
	private void printActions() {
		System.out.println("=====================");
		for(int i = 0; i < Actions.ACTIONS.length; i++) {
			System.out.printf("%d. %s\n", i, Actions.ACTIONS[i]);
		}
		System.out.println("=====================\n");
	}

	@Override
	public void introduction() {
		System.out.println("=============");
		System.out.println("Day  : " + getDay());
		System.out.println("=============");
	}

	@Override
	public void action() {
		printActions();
		this.action = in.getOptsStrWMSG("Choose your act of love: ", Actions.ACTIONS);
	}
	
	@Override
	public void updateResource(String action) {
		addDay(1);
	}

	@Override
	public String response() {
		return this.action;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void	addDay(int add) {
		this.day += add;
	}
}
package main;

import models.Burger;
import models.Restaurant;
import models.Rupiah;
import modules.BurgerBuilder;
import modules.GetInput;
import modules.RupiahAdapter;

public class Main {
	private GetInput in;
	private Restaurant restaurant;
	
	public Main() {
		this.in = new GetInput();
		this.restaurant = Restaurant.getRestaurantInstance();
		menuHome();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	private void printTitle() {
		System.out.println("\r\n"
				+ "▄▀█ ▀▄▀ █▀▀ █▀█ █▀█ █▀█ ▄▀█ ▀█▀ ▀█▀ █▄█\r\n"
				+ "█▀█ █░█ █▀░ █▄█ █▀▄ █▀▀ █▀█ ░█░ ░█░ ░█░\r\n");
	}
	
	private void clear() {
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
	}
	
	private int optHome() {
		System.out.println("1. Custom a burger");
		System.out.println("2. View burgerpedia");
		System.out.println("3. Exit");
		System.out.println("Choose a menu:");
		return in.getInMsg(">> ", 1, 3);
	}
	
	private boolean promptCustomize(String type) {
		return in.getBoolFromCharMsg("Do you want to customize the " + type + " [Y|N]:", 'Y', 'N');
	}
	
	private void menuCustom() {
		BurgerBuilder burgerBuilder = new BurgerBuilder(new Burger());
		if(promptCustomize("patty")) burgerBuilder.setPatty(in.getInMsg("Amount of patties [1..5]: ", 1, 5));
		if(promptCustomize("cheese")) burgerBuilder.setCheese(in.getInMsg("Slice of cheese [1..5]: ", 1, 5));
		if(promptCustomize("bun")) burgerBuilder.setBun(in.getInMsg("Amount of buns [1..5]:", 1, 5));
		if(promptCustomize("vegetable")) burgerBuilder.setVegetable(in.getBoolFromCharMsg("Include vegies [Y|N]: ", 'Y', 'N'));
		if(promptCustomize("pickle")) burgerBuilder.setPickle(in.getBoolFromCharMsg("Include pickles [Y|N]: ", 'Y', 'N'));
		if(promptCustomize("smash")) burgerBuilder.setSmash(in.getBoolFromCharMsg("Smash burger [Y|N]: ", 'Y', 'N'));
		if(promptCustomize("name")) burgerBuilder.setName(in.getStrMsg("Insert the name of your burger [1..30]", 1, 30));
		restaurant.addBurger(burgerBuilder.getBurger());
	}
	
	private void menuView() {
		String opts[] = {"IDR", "SGD", "MYR"};
		String opt = in.getOptsMsg("Input the currency you're using [IDR | SGD | MYR]: ", opts);
		RupiahAdapter currency = new RupiahAdapter();
		switch (opt) {
		case "IDR":{
			restaurant.viewAllBurgerWCurse(new Rupiah());
			break;
		}
		case "SGD": {
			currency.setSGD();
			restaurant.viewAllBurgerWCurse(currency);
			break;
		}
		case "MYR": {
			currency.setMYR();
			restaurant.viewAllBurgerWCurse(currency);
			break;
		}
		default: {
			break;
		}
		}
	}
	
	private boolean menuExit() {
		return false;
	}
	
	private void menuHome() {
		boolean run = true;
		int opt;
		
		while (run) {
			clear();
			printTitle();
			opt = optHome();
			
			switch (opt) {
			case 1: {
				menuCustom();
				break;
			}
			case 2: {
				menuView();
				break;
			}
			default: {
				run = menuExit();
				break;
			}
			
			}
		}
	}
}
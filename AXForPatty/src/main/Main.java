package main;

import modules.GetInput;
import source.ConsoleInput;

public class Main {
	private GetInput in;
	
	public Main() {
		in = new GetInput();
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
	
	private void menuCustom() {
		int patty = in.getInMsg("Amount of patties [1..5]: ", 1, 5);
		int cheese = in.getInMsg("Slice of cheese [1..5]: ", 1, 5);
		int bun = in.getInMsg("Amount of buns [1..5]:", 1, 5);
		boolean vegetable = in.getBoolFromCharMsg("Include vegies [Y|N]: ", 'Y', 'N');
		boolean pickle = in.getBoolFromCharMsg("Include pickles [Y|N]: ", 'Y', 'N');
		boolean smash = in.getBoolFromCharMsg("Smash burger [Y|N]: ", 'Y', 'N');
		
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
				
				break;
			}
			case 2: {
				break;
			}
			default: {
				
				break;
			}
			
			}
		}
	}
}
package main;

import modules.GetInput;
import source.ConsoleInput;

public class Main {
	private GetInput in;
	
	public Main() {
		in = new GetInput(new ConsoleInput());
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
	
	private void menuHome() {
		clear();
		printTitle();
		
		boolean run = true;
		int opt;
		while (run) {
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
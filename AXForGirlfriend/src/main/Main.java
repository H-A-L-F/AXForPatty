package main;

import models.Girlfriend;
import models.Player;
import modules.Input;
import modules.PlayerAi;
import source.ConsoleInput;

public class Main {
	private Input in;
	
	public Main() {
		this.in = new ConsoleInput();
		
		menuHome();
	}
	
	private void printTitle() {
		System.out.println("\r\n"
				+ "▄▀█ ▀▄▀ █▀▀ █▀█ █▀█ █▀▀ █ █▀█ █░░ █▀▀ █▀█ █ █▀▀ █▄░█ █▀▄\r\n"
				+ "█▀█ █░█ █▀░ █▄█ █▀▄ █▄█ █ █▀▄ █▄▄ █▀░ █▀▄ █ ██▄ █░▀█ █▄▀\r\n");
	}
	
	private void clear() {
		for(int i = 0; i < 25; i++) System.out.println();
	}
	
	private void optHome() {
		System.out.println("1. Ask For Girlfriend");
		System.out.println("2. How to play");
		System.out.println("3. Exit");
	}
	
	private void menuHome() {
		boolean run = true;
		int opt = 0;
		
		while (run) {
			clear();
			printTitle();
			optHome();
			opt = in.getIntWMSG(">> ", 1, 3);
			
			switch (opt) {
			case 1: {
				menuPlay();
				break;
			}
			case 2: {
				menuTutorial();
				break;
			}
			default: {
				run = false;
				break;
			}
			}
		}
	}
	
	private void menuPlay() {
		boolean playing = true;
		
		PlayerAi player = new Player();
		PlayerAi girlfriend = new Girlfriend();
		
		
		while (playing) {
			clear();
			String res = player.run("");
			if(girlfriend.run(res).equals("done")) {
				break;
			}
		}
	}
	
	private void menuTutorial() {
		System.out.println("You need to win by");
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

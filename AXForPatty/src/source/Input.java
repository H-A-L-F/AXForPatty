package source;

import java.util.Scanner;

abstract public class Input {
	Scanner in = new Scanner(System.in);
	
	public abstract int getInt(int min, int max);
	
	public abstract String getStr();
}

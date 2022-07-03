package modules;

import source.Input;

public class GetInput {
	private Input in;
	
	public GetInput(Input in) {
		this.in = in;
	}
	
	public int getInMsg(String msg, int min, int max) {
		int res = 0;
		do {
			System.out.printf(msg);
			res = in.getInt(min, max);
		} while (res < min || res > max);
		return res;
	}
}
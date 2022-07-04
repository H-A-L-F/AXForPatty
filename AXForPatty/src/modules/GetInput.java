package modules;

import source.ConsoleInput;
import source.Input;

public class GetInput {
	private Input in;
	
	public GetInput() {
		this.in = new ConsoleInput();
	}
	
	public int getInMsg(String msg, int min, int max) {
		return in.getIntWMSG(msg, min, max);
	}
	
	public boolean getBoolFromCharMsg(String msg, char yes, char no) {
		return in.getBoolFromCharWMSG(msg, yes, no);
	}
	
	public String getStrMsg(String msg, int min, int max) {
		return in.getStrWMSG(msg, min, max);
	}
	
	public String getOptsMsg(String msg, String opts[]) {
		return in.getOptsStrWMSG(msg, opts);
	}
}
package modules;

abstract public class Input {
	public abstract int getInt(int min, int max);
	
	public abstract int getIntWMSG(String msg, int min, int max);
	
	public abstract boolean getBoolFromChar(char yes, char no);
	
	public abstract boolean getBoolFromCharWMSG(String msg, char yes, char no);
	
	public abstract String getStr(int min, int max);
	
	public abstract String getStrWMSG(String msg, int min, int max);
	
	public abstract String getOptsStrWMSG(String msg, String opts[]);
}

package source;

public class ConsoleInput extends Input{

	@Override
	public int getInt(int min, int max) {
		int res = -1;
		do {
			try {
				res = in.nextInt();
			} catch (Exception e) {
				System.out.println("Input a number");
			}
			in.nextLine();
		} while (res < min || res > max);
		return res;
	}

	@Override
	public boolean getBoolFromChar(char yes, char no) {
		char ch;
		do {
			ch = in.next().charAt(0);
		} while (ch != yes && ch != no);
		return ch == yes;
	}

	@Override
	public int getIntWMSG(String msg, int min, int max) {
		int res = -1;
		do {
			System.out.println(msg);
			try {
				res = in.nextInt();
			} catch (Exception e) {
				System.out.println("Input a number");
			}
			in.nextLine();
		} while (res < min || res > max);
		return res;
	}

	@Override
	public boolean getBoolFromCharWMSG(String msg, char yes, char no) {
		char ch;
		do {
			System.out.println(msg);
			ch = in.next().charAt(0);
		} while (ch != yes && ch != no);
		return ch == yes;
	}

	@Override
	public String getStr(int min, int max) {
		String res = "";
		int len = res.length();
		do {
			res = in.nextLine();
			len = res.length();
		} while (len < min || len > max);
		return res;
	}

	@Override
	public String getStrWMSG(String msg, int min, int max) {
		String res = "";
		int len = res.length();
		do {
			System.out.println(msg);
			res = in.nextLine();
			len = res.length();
		} while (len < min || len > max);
		return res;
	}
}

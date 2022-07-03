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
	public String getStr() {
		return null;
	}
	
}

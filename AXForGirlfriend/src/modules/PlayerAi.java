package modules;

public abstract class PlayerAi {
	int resource;
	
	public PlayerAi(int resource) {
		super();
		this.resource = resource;
	}
	
	public String run(String arg) {
		introduction();
		action();
		updateResource(arg);
		return response();
	}
	
	abstract public void introduction();
	abstract public void action();
	abstract public void updateResource(String action);
	abstract public String response();

	public int getResource() {
		return resource;
	}

	public void setResource(int resource) {
		this.resource = resource;
	}
	
	public void addResource(int add) {
		this.resource += add;
	}
}

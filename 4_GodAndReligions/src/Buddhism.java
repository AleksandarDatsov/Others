public class Buddhism {
	private static God god;
	private String name;
	
	static {
		god = new God("Buddha", "Buddhism");
	}
	void prey(){
		System.out.println(name + " is preying to " + god.getName());
	}
	
	public static God getGod() {
		return god;
	}
	public static void setGod(God god) {
		Buddhism.god = god;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

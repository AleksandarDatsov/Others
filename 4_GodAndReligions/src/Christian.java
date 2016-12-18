public class Christian {
	private static God god;
	private String name;

	static {
		god = new God("Jesus", "Christianity");
	}
	
	void prey(){
		System.out.println(name + " is preying to " + god.getName());
	}
	public static God getGod() {
		return god;
	}

	public static void setGod(God god) {
		Christian.god = god;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Muslim {

	private static God god;
	private static String name;

	static {
		god = new God("Allah", "Islamic");
	}

	public Muslim(String name) {
		setName(name);
	}

	void prey() {
		System.out.println(name + " is preying to " + god.getName());
	}

	public static God getGod() {
		return god;
	}

	public static void setGod(God god) {
		Muslim.god = god;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class God {
	private String name;
	private String religion;

	public God(String name, String religion) {
		setName(name);
		setReligion(religion);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		if (religion != null)
			this.religion = religion;
	}

}


public class User {
	private String userName;
	private String egn;
	
	
	User(String name, String eng){
		setUserName(name);
		setEgn(eng);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(userName !=null)
		this.userName = userName;
	}
	public String getEgn() {
		return egn;
	}
	public void setEgn(String egn) {
		if(egn != null && egn.length() == 10 && !egn.equals(""))
			this.egn = egn;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", egn=" + egn + "]";
	}
	
}

package dto;

public class Staff {
	private int id;
	private String loginid;
	private String salt;
	private String password;
	private String hashedPassword;
	
	public Staff(int id, String loginid, String salt, String password, String hashedPassword) {
		super();
		this.id = id;
		this.loginid = loginid;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	
}
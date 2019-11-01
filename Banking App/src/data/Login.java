package data;

public class Login {
	private int id;
	private String userName;
	private String password;
	private boolean checking;
	private boolean saving;
	private boolean joinAccount;
	private boolean activeAccount;
	
	
	public Login() {
		super();
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return this.userName;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
	
	
	public void setChecking(boolean checking) {
		this.checking=checking;		
	}
	
	public boolean getChecking() {
		return this.checking;		
	}
	
	public void setSaving(boolean saving) {
		this.saving=saving;		
	}
	
	public boolean getSaving() {
		return this.saving;		
	}
	
	public void setJoinAccount(boolean joinAccount) {
		this.joinAccount=joinAccount;		
	}
	
	public boolean getJoinAccount() {
		return this.joinAccount;		
	}
	
	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount=activeAccount;		
	}
	
	public boolean getActiveAccount() {
		return this.activeAccount;		
	}
	
		
	
	
	
	

}

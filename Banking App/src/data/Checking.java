package data;

public class Checking {
	public Checking() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private int userId;
	private int balance;
	private boolean access=false;
	
	
	
	public void login(int id) {
		if(this.id==id)
			this.access=true;
		else
			this.access=false;		
	}
	
	public void createChecking(int id,int userId, int balance) {
		this.id=id;
		this.balance=balance;
		this.userId=userId;
	}
	public int getId() {
		return this.id;
	}
	public int getUserId() {
		return userId;
	}
	
	@SuppressWarnings("null")
	public int getBalance() {
		if(this.access==true)
			return this.balance;
		else
			return (Integer) null;
	}
	
	public void add2Balance(int i) {
		if(this.access==true)
			this.balance+=i;
		
	}
	public void subtact2Balance(int i) {
		if(this.access==true)
			this.balance-=i;
	}
	
	public void closeAcess() {
		this.access=false;
	}
	public void theAccesss(boolean access) {
		this.access=access;
	}
	
	
	
	

}

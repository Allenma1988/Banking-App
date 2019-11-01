package data;

public class Saving {
	public Saving() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private int balance;
	private boolean access=false;
	
	public void login(int id) {
		if(this.id==id)
			this.access=true;
		else
			this.access=false;		
	}
	
	public void createSaving(int id, int balance) {
		this.id=id;
		this.balance=balance;
	}
	public int getId() {
		return this.id;
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
	

}

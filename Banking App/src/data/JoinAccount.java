package data;

import java.util.ArrayList;
import java.util.List;

public class JoinAccount {
	public JoinAccount() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private List altId=new ArrayList();
	private double balance;
	
	public void createJoinAccount(int id, int altId) {
		this.id=id;
		this.altId.add(altId);
	}
	
	
	public void addNewJoin(int altID) {
		this.altId.add(altId);
	}
	
	public void removeJoin(int altId) {
		this.altId.remove(altId);
	}
	
	public List getList() {
		return altId;
	}
	

}

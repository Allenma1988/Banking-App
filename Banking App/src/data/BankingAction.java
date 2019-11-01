package data;

import java.util.ArrayList;
import java.util.List;

public class BankingAction {
	public BankingAction() {
		// TODO Auto-generated constructor stub
	}
	
	List<Login> UserList=new ArrayList<Login>();
	List<Checking> CheckingList=new ArrayList<Checking>();
	List<Saving> SavingList=new ArrayList<Saving>();
	
	
	
	public void createUser(String userName, String password) {
		Login newGuy=new Login();
		newGuy.setId(UserList.size());
		newGuy.setUserName(userName);
		newGuy.setPassword(password);
		newGuy.setChecking(false);
		newGuy.setSaving(false);
		newGuy.setJoinAccount(false);
		UserList.add(newGuy);
	}
	
	public Login getUser(String userName, String password) {
		Login user=null;
		Login temp;
		
		for(int i=0;i<UserList.size();i++) {
			temp=UserList.get(i);
			if (temp.getUserName().contentEquals(userName)&&temp.getPassword().contentEquals(password))
				user=temp;			
		}
		return user;
	}
	public int getId(String userName) {
		int x=-1;
		for(int i =0;i<UserList.size();i++) {
			if(UserList.get(i).getUserName().equals(userName)) {
				x=i;
			}			
		}
		
		return x;
	}
	public String getUserName(int id) {
		return UserList.get(id).getUserName();
		
	}
	public String getPassword(int id) {
		return UserList.get(id).getPassword();
		
	}
	
	public void createChecking(int id, int balance) {
		Checking newGuy=new Checking();
		newGuy.createChecking(id, balance);
		CheckingList.add(newGuy);		
	}
	
	public Checking getUserChecking(int id) {
		return CheckingList.get(id);
	}
	
	public void createSaving(int id, int balance) {
		Saving newGuy=new Saving();
		newGuy.createSaving(id, balance);
		SavingList.add(newGuy);
	}
	public Saving getUserSaving(int id) {
		return SavingList.get(id);
	}
	
	
	
	public boolean checkChecking(int id)
	{
		return UserList.get(id).getChecking();
	}
	public void setCheckingOn(int id) {
		UserList.get(id).setChecking(true);
	}
	public void setCheckingOff(int id) {
		UserList.get(id).setChecking(false);
	}
	
	
	
	public boolean checkSaving(int id)
	{
		return UserList.get(id).getSaving();
	}
	public void setSavingOn(int id) {
		UserList.get(id).setSaving(true);
	}
	public void setSavingOff(int id) {
		UserList.get(id).setSaving(false);
	}
	
	public boolean checkJoinAccount(int id)
	{
		return UserList.get(id).getJoinAccount();
	}
	public void setJoinAccountOn(int id) {
		UserList.get(id).setJoinAccount(true);
	}
	public void setJoinAccountOff(int id) {
		UserList.get(id).setJoinAccount(false);
	}
	

}

package data;

import java.util.Scanner;

public class UserAction {
	public UserAction() {
		// TODO Auto-generated constructor stub
	}
	private int currentId;
	private String currentUser;
	private String currentPassword;
	
	private BankingAction theBank=new BankingAction();
	
	
	public void runBankingApp() {
		
		Welcome();
		AttemptLoging();
	}
	
	
	public void Welcome() {
		System.out.println("Wecome to Allen's Bank!");
		System.out.println("Where the bank dont steal from the customer. ");
		System.out.println("...most of the time");
	}
	
	public boolean AttemptLoging() {
		boolean Attempt=false;
		@SuppressWarnings("resource")
		Scanner myObj= new Scanner(System.in);
		System.out.println("Please sign in.\nEnter user:");
		currentUser=myObj.nextLine();
		System.out.println("Enter your password");
		currentPassword=myObj.nextLine();
		System.out.println("User= "+currentUser);
		System.out.println("Password= "+currentPassword);
		
		return Attempt;
	}
	
	public boolean CreateNewUser() {
		boolean Attempt=false;
		Scanner myObj= new Scanner(System.in);
		System.out.println("Create a user name.\nEnter user:");
		currentUser=myObj.nextLine();
		System.out.println("Enter your password");
		currentPassword=myObj.nextLine();
			
		
		theBank.createUser(currentUser,currentPassword);
		
		System.out.println("Id= "+theBank.getId(currentUser));
		System.out.println("User= "+currentUser);
		System.out.println("Password= "+currentPassword);
		
		
		return Attempt;
	}
	
	
	
	
	
	

}

package Section_9;
import java.util.Date;
//’Àªß¿‡Account
public class E9_7 {
	public static void main(String[] args) {
		Account account = new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
	    System.out.println("Monthly interest is " +
	      account.getMonthlyInterestRate());
	    System.out.println("This account was created at " +
	      account.getDateCreated());
	}

}
class Account{
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		dateCreated = new Date();
	}
	public Account(int newID,double newBalance){
		id = newID;
		balance = newBalance;
		dateCreated = new Date();
	}
	public int getID(){
		return this.id;
	}
	public double getBalance(){
		return balance;
	}
	public static double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setID(int newID){
		id = newID;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public static void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void withDraw(double amount){
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
	
	
}

import java.util.Date;

public class Account{
	private int id;
	private double balance, annualInterestRate = 4.5;
	private Date dateCreated;

	public Account(){
		id = 0;
		balance = 1000;
		dateCreated = new Date();
	}

	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getID(){
		return id;
	}

	public double getBalance(){
		return balance;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}

	public Date getDate(){
		return dateCreated;
	}

	public void setID(int id){
		this.id = id;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void setAnnualInterestRate(double newRate){
		annualInterestRate = newRate;
	}

	public int withDraw(double amount){
		if(amount > balance){
			System.out.println("Not enough money in your balance");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public void deposit(double amount){
		if(amount >= 0){
			balance += amount;
		}
	}
}
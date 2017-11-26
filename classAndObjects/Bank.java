import java.time.LocalDate;
public class Bank{
	int id;
	double balance;
	double annualInterestRate;
	//Aggregation
	//HAS-A relationship 
	//Bank has a realtion ship with date of account creation
	LocalDate dateCreated;
	Bank(){
		id=0;
		balance=0.0;
		annualInterestRate=0.0;
		//dateCreated=LocalDate.now();
	}
	Bank(int id,double balance,double annualInterestRate){
		this();
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		
	}
	public void displayBankDetails(){
		System.out.println("Bank Details");
		System.out.println("bank id-->"+id);
		System.out.println("bank balance-->"+balance);
		System.out.println("date of creation-->"+dateCreated);
	}
}
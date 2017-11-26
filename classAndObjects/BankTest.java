import java.time.LocalDate;
class BankTest{
	//aggregation example;
	public static void main(String[] args) {
		Bank bankObj= new Bank();
		bankObj.dateCreated= LocalDate.now();
		
		Bank bankObj1= new Bank(101,100000.00,3.4);
		bankObj1.dateCreated=LocalDate.now();
		bankObj.displayBankDetails();
		
		bankObj1.displayBankDetails();

	}
}
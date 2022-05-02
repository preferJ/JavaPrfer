package day31_2_Bank;

public class BankDTO {

/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the accountNumber
 */
public String getAccountNumber() {
	return accountNumber;
}
/**
 * @param accountNumber the accountNumber to set
 */
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
/**
 * @return the deposit
 */
public int getDeposit() {
	return deposit;
}
/**
 * @param deposit the deposit to set
 */
public void setDeposit(int deposit) {
	this.deposit = deposit;
}
/**
 * @return the withdraw
 */
public int getWithdraw() {
	return withdraw;
}
/**
 * @param withdraw the withdraw to set
 */
public void setWithdraw(int withdraw) {
	this.withdraw = withdraw;
}
/**
 * @return the bankingDate
 */
public String getBankingDate() {
	return bankingDate;
}
/**
 * @param bankingDate the bankingDate to set
 */
public void setBankingDate(String bankingDate) {
	this.bankingDate = bankingDate;
}

@Override
public String toString() {
	return "BankDTO [id=" + id + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw=" + withdraw
			+ ", bankingDate=" + bankingDate + "]";
}

/**
 * @param id
 * @param accountNumber
 * @param deposit
 * @param withdraw
 * @param bankingDate
 */
public BankDTO(int id, String accountNumber, int deposit, int withdraw, String bankingDate) {
	super();
	this.id = id;
	this.accountNumber = accountNumber;
	this.deposit = deposit;
	this.withdraw = withdraw;
	this.bankingDate = bankingDate;
}

public BankDTO() {
	// TODO Auto-generated constructor stub
}
int id;
String accountNumber;
int deposit;
int withdraw;
String bankingDate;
}

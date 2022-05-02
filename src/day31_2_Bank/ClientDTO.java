package day31_2_Bank;

public class ClientDTO {
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
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the clientPass
	 */
	public String getClientPass() {
		return clientPass;
	}
	/**
	 * @param clientPass the clientPass to set
	 */
	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}
	/**
	 * @return the clientCreatedDate
	 */
	public String getClientCreatedDate() {
		return clientCreatedDate;
	}
	/**
	 * @param clientCreatedDate the clientCreatedDate to set
	 */
	public void setClientCreatedDate(String clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
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
	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", clientPass=" + clientPass
				+ ", balance=" + balance + ", accountNumber="
				+ accountNumber + ", clientName=" + clientName+ ", clientCreatedDate=" + clientCreatedDate  + "]";
	}
	/**
	 * @param id
	 * @param clientName
	 * @param clientPass
	 * @param clientCreatedDate
	 * @param balance
	 * @param accountNumber
	 */
	public ClientDTO(int id, String clientName, String clientPass, String clientCreatedDate, int balance,
			String accountNumber) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.clientCreatedDate = clientCreatedDate;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public ClientDTO() {
		// TODO Auto-generated constructor stub
	}
	int id;
	String clientName;
	String clientPass;
	String clientCreatedDate;
	int balance;
	String accountNumber;
	

}

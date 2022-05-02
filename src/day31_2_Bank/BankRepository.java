package day31_2_Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
	static List<BankDTO> bankList = new ArrayList<>();
	static List<ClientDTO> clientList = new ArrayList<>();
	static int clientIdNumber = 1;
	static int bankingID = 1;

	void addMember(String accountNumber, String clientPass, String clientName) {
		LocalDateTime now = LocalDateTime.now();
		String accountCheckVal = accountCheck(accountNumber);
		
		if (accountCheckVal == "Account number does not exist") {
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
			ClientDTO newClient = new ClientDTO(clientIdNumber, clientName, clientPass, formatedNow, 0, accountNumber);
			clientList.add(newClient);
			clientIdNumber++;
	
		}else {
			System.out.println("계좌번호가 중복입니다.");
		}
		

	}

	void balanceInquiry(String accountNumber) {
		String accountCheckVal = accountCheck(accountNumber);
		if (accountCheckVal == "Account number does not exist") {
			System.out.println(accountCheckVal);
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (accountNumber.equals(clientList.get(i).accountNumber)) {
					System.out.println(clientList.get(i));
				}
			}
		}
	}

	void depositMoney(String accountNumber, int deposit) {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		BankDTO newBanking = new BankDTO(bankingID, accountNumber, deposit, 0, formatedNow);
		String accountCheckVal = accountCheck(accountNumber);

		if (accountCheckVal == "Account number does not exist") {
			System.out.println(accountCheckVal);
		} else {

			bankList.add(newBanking);
			for (int i = 0; i < clientList.size(); i++) {
				if (accountNumber.equals(clientList.get(i).accountNumber)) {
					int temp = clientList.get(i).balance + deposit;
					clientList.get(i).setBalance(temp);
				}
			}
			bankingID++;
		}
	}

	void withdrawMoney(String accountNumber, String clientPass, int withdraw) {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		String accountCheckVal = accountCheck(accountNumber);
		String pwCheckVal = pwCheck(accountNumber, clientPass);

		if (accountCheckVal == "Account number does not exist") {
			System.out.println(accountCheckVal);
		} else if (pwCheckVal == "Passwords do not match") {
			System.out.println(pwCheckVal);

		} else {
			BankDTO newBanking = new BankDTO(bankingID, accountNumber, 0, withdraw, formatedNow);
			bankList.add(newBanking);
			for (int i = 0; i < clientList.size(); i++) {
				if (accountNumber.equals(clientList.get(i).accountNumber)) {
					if (withdraw > clientList.get(i).balance) {
						System.out.println("not enough balance");
					} else {
						int temp = clientList.get(i).balance - withdraw;
						clientList.get(i).setBalance(temp);
					}
				}
			}
			bankingID++;
		}
	}

	void transactionHistoryAll() {
		for (int i = 0; i < bankList.size(); i++) {
			System.out.println(bankList.get(i));
		}
	}
	
	void transactionHistoryDeposit(String accountNumber) {
		String accountCheckVal = accountCheck(accountNumber);

		if (accountCheckVal == "Account number does not exist") {
			System.out.println(accountCheckVal);
			}else {
				for(int i = 0 ; i < bankList.size() ; i ++ ) {
					if(bankList.get(i).deposit != 0 && accountNumber.equals(bankList.get(i).accountNumber)) {
						System.out.println(bankList.get(i));
					}
				}
			}
		
		
	}
	void transactionHistoryWithDraw(String accountNumber) {
		String accountCheckVal = accountCheck(accountNumber);
		
		if (accountCheckVal == "Account number does not exist") {
			System.out.println(accountCheckVal);
		}else {
			for(int i = 0 ; i < bankList.size() ; i ++ ) {
				if(bankList.get(i).withdraw != 0 && accountNumber.equals(bankList.get(i).accountNumber)) {
					System.out.println(bankList.get(i));
				}
			}
		}
		
		
	}

	String accountCheck(String accountNumber) {
		String acc = "Account number does not exist";
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).accountNumber)) {
				acc = accountNumber;
			}
		}
		return acc;

	}

	String pwCheck(String accountNumber, String pw) {

		String pww = "Passwords do not match";
		int num = 999999;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).accountNumber)) {
				num = i;
			}
		}
		if (num != 999999) {
			if (pw.equals(clientList.get(num).clientPass)) {
				pww = pw;
			}
		}

		return pww;

	}

}

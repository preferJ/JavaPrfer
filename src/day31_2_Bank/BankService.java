package day31_2_Bank;

import java.util.Scanner;

public class BankService {
	BankRepository br = new BankRepository();
	Scanner sc = new Scanner(System.in);

	String accountCheck() {
		System.out.println("계좌번호 입력 : ");

		return sc.next();
	}

	String nameCheck() {
		System.out.println("이름 입력 : ");

		return sc.next();
	}

	String pwCheck() {
		boolean run = true;
		String pw = "";
		int pwC = 0;
		while (run) {
			try {

				System.out.println("비밀번호 입력 : ");
				pwC = sc.nextInt();
				pw = String.valueOf(pwC);
				if (pw.length() != 4) {
					throw new Exception();
				} else {
					run = false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("비밀번호는 숫자 4자리 입니다.");
			}

		}

		return pw;

	}

	public int depositCheck() {
		System.out.println("입금 금액 입력");
		int depositBalance = sc.nextInt();
		return depositBalance;
	}

	public int withdrawCheck() {
		System.out.println("출금 금액 입력");
		int withdrawBalance = sc.nextInt();
		return withdrawBalance;
	}

	void addMember() {
		String accountNumber = accountCheck();
		String clientPass = pwCheck();
		String clientName = nameCheck();
		br.addMember(accountNumber, clientPass, clientName);
	}

	void balanceInquiry() {
		String accountNumber = accountCheck();
		br.balanceInquiry(accountNumber);
	}

	void depositMoney() {
		String accountNumber = accountCheck();
		int deposit = depositCheck();
		br.depositMoney(accountNumber, deposit);
	}

	void withdrawMoney() {
		String accountNumber = accountCheck();
		int withdraw = withdrawCheck();
		String clientPass = pwCheck();
		br.withdrawMoney(accountNumber, clientPass, withdraw);
	}

	void transactionHistoryAll() {
		br.transactionHistoryAll();

	};

	void transactionHistoryDeposit() {
		String accountNumber = accountCheck();
		br.transactionHistoryDeposit(accountNumber);

	};

	void transactionHistoryWithDraw() {
		String accountNumber = accountCheck();
		br.transactionHistoryWithDraw(accountNumber);

	};

}
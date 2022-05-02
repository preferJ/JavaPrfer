package day31_2_Bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankService bs = new BankService();
		boolean run1 = true;

		boolean run2 = true;

		int key1 = 0;
		int key2 = 0;

		while (run1) {
			run2 = true;
			System.out.println("─────────────────────────────────────────────────────────────────────");
			System.out.println("│ 1.신규 고객 등록 ││ 2.잔액조회 ││ 3.입금 ││ 4.출금 ││ 5.거래내력확인 ││ 6.종료 │");
			System.out.println("─────────────────────────────────────────────────────────────────────");
			key1 = sc.nextInt();
			switch (key1) {
			case 1: {
				bs.addMember();
				break;
			}
			case 2: {
				bs.balanceInquiry();
				break;
			}
			case 3: {
				bs.depositMoney();
				break;
			}
			case 4: {
				bs.withdrawMoney();
				break;
			}
			case 5: {
				while (run2) {
					System.out.println("──────────────────────────────────────────");
					System.out.println("│ 1.모든 거래 내역 ││ 2.입금 내역 ││ 3.출금 내역 │");
					System.out.println("──────────────────────────────────────────");
					key2 = sc.nextInt();
					switch (key2) {
					case 1: {
						bs.transactionHistoryAll();
						run2 = false;

						break;
					}
					case 2: {

						bs.transactionHistoryDeposit();
						run2 = false;

						break;
					}
					case 3: {
						bs.transactionHistoryWithDraw();
						run2 = false;
						break;
					}
					default:
						System.out.println("올바른 키를 입력해주세요");

					}

				}
				break;
			}
			case 6: {
				System.out.println("종료");
				run1 = false;
				break;
			}
			default:
				System.out.println("올바른 키를 입력해주세요");
			}

		}

	}

	// -------------------------------------------------------------------------- //

}

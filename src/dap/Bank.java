package dap;

import java.util.Scanner;

public class Bank {
	String name ;
	String account ;
	int balance ;
	int input;  
	int output;	
	
	Bank(){}
	
	Bank(String name, String account, int balance){
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	public void inchul(int output) {

		if (balance - output < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance = balance - output;
			System.out.println("인출한 금액은" + output);
		}
	}

	public void ipgum(int input) {

		balance = balance + input;
		System.out.println("입금한 금액은" + input);
	}
	
	@Override
	public String toString() {
		return ("예금주 : " + name + ", " + "계좌번호 : " + account + ", " + " 잔액 : " + balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("예금주 이름을 입력하세요. : ");
		String scc = sc.nextLine();
		System.out.println("계좌번호를 입력하세요. : ");
		String scc1 = sc.nextLine();
		System.out.println("잔액을 입력하세요. : ");
		int scc2 =sc.nextInt();
		System.out.println("인출한 금액을 입력하세요. : ");
		int scc3 =sc.nextInt();
		System.out.println("입금한 금액을 입력하세요. : ");
		int scc4 =sc.nextInt();
		
		Bank b2 = new Bank(scc,scc1,scc2);
		System.out.println(b2.toString());
		b2.inchul(scc3);
		b2.ipgum(scc4);
	}

}

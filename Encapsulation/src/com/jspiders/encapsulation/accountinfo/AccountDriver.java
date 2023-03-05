package com.jspiders.encapsulation.accountinfo;

public class AccountDriver {

	public static void main(String[] args) {
		Account ac=new Account("pragati",145678976,25000);
		ac.getAccountDetails();
		ac.setName("manisha");
		System.out.println(ac.getName());
		ac.getAccountDetails();
		System.out.println(ac.getAccBal());
		ac.setAccBal(1000);
		ac.getAccountDetails();
		

	}

}

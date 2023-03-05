package com.jspiders.encapsulation.accountinfo;

public class Account {
	private String acc_hol_name;
	private long acc_no;
	private double balance;
	
	Account(String accname,long accno,double bal)
	{
		this.acc_hol_name=accname;
		this.acc_no=accno;
		this.balance=bal;
	}
     public String getName()
     {
    	 return acc_hol_name;
     }
     public void setName(String newname)
     {
    	 acc_hol_name=newname;
     }
     public long getAccountNo()
     {
    	 return acc_no;
     }
     public void setAccountNo(long newaccno)
     {
    	 acc_no=newaccno;
     }
     public double getAccBal()
     {
    	 return balance;
     }
     public void setAccBal(double newbal)
     {
    	 this.balance=this.balance+newbal;
     }
     public void getAccountDetails() 
     {
    	 System.out.println("Account holder name="+acc_hol_name);
    	 System.out.println("Account number="+acc_no);
    	 System.out.println("Account balance="+balance);
		
	}
	

}

package org.system;

public class AxisBank extends BankInfo {
	
	public void deposit(int x)
	{
		System.out.println("Current Balance : "+x);
	}

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		BankInfo bank = new BankInfo();
		
		axis.saving();
		axis.fixed(5.70);
		bank.deposit(10000);
		axis.deposit(10000);

	}

}

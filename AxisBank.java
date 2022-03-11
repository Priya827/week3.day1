package week3.day1;

public class AxisBank {

	public void deposit()
	{
		System.out.println("Deposit: overriding");
	}
	public static void main(String[] args)
	{
		BankInfo b = new BankInfo();
		b.deposit();
		AxisBank a = new AxisBank();
		a.deposit();
	}
}

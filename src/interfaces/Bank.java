package interfaces;
//Program to define Bank interface
public interface Bank {
	
	static final float MINBAL=5000;
	static final float DEPOSIT_LIMIT=25000; 
	public void deposit(float amount);
	public void withdraw(float amount);

}

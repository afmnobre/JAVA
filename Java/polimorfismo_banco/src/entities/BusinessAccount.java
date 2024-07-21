package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void Loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0; // BALANCE esta na classe principal
		}
	}
	@Override
	public void withDraw (double amount) {
		super.withDraw(amount); //Usa o metodo da SuperClasse
		balance -= 2.0; // depois faz a chamada do withdraw da BusinessAccount
	}
	
}

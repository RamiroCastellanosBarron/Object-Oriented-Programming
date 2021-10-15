import java.util.*;

public class Account {
	private Customer customer;//obj
	private int accountId;
	private String accountType;
	private String currency;
	private double annualInterestRate;
	private double minBalanceReq;
	private DateOfExpiry dateOfExpiry;//obj
	private double balance;

	public Account(Customer customer, int accountId, String accountType, String currency, double annualInterestRate, double minBalanceReq, DateOfExpiry dateOfExpiry, double balance) {
		setCustomer(customer);
		setAccountId(accountId);
		setAccountType(accountType);
		setCurrency(currency);
		setAnnualInterestRate(annualInterestRate);
		setMinBalanceReq(minBalanceReq);
		setDateOfExpiry(dateOfExpiry);
		setBalance(balance);
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return currency;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setMinBalanceReq(double minBalanceReq) {
		this.minBalanceReq = minBalanceReq;
	}
	public double getMinBalanceReq() {
		return minBalanceReq;
	}
	public void setDateOfExpiry(DateOfExpiry dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public DateOfExpiry getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	//metodo para leer el saldo inicial
	public void leerSaldoInicial() {
		setBalance(validarSaldoInicial());
	}

	//metodo para realizar el deposito
	public void depositarSaldo() {
		double deposito = validarMonto("\nIngresa el monto a depositar: ");
		balance += deposito;
		setBalance(balance);
	}

	//metodo para realizar el retiro
	public void retirarSaldo() {
		double retiro = validarMonto("\nIngrese el monto a retirar: ");
		if ((balance - retiro) >= 5000) {
			balance -= retiro;
			setBalance(balance);
		} else {
			System.out.println("\nNo puedes retirar esa cantidad. El saldo minimo debe ser $5000.00MXN");
		}
	}

	//metodo para leer y validar e monto inicial ingresado
	public static double validarSaldoInicial() {
		Scanner sc = new Scanner(System.in);
		double variable = 0;
		boolean valid = false;

		while (valid == false) {
			System.out.println("\nIngresa el saldo inicial: ");
			variable = sc.nextDouble();
			if (variable >= 5000) {
				valid = true;	
			} else {
				System.out.println("\nEl monto debe ser mayor que $5000.00MXN");
			}
		}
		return variable;
	}

	//metodo para leer y validar los montos de los depositos y los retiros
	public static double validarMonto(String mensaje) {
		Scanner sc = new Scanner(System.in);
		double variable = 0;
		boolean valid = false;

		while (valid == false) {
			System.out.println(mensaje);
			variable = sc.nextDouble();
			if (variable > 0) {
				valid = true;
			} else {
				System.out.println("\nEl monto debe ser mayor que 0.");
			}	
		}
		return variable;
	}
}
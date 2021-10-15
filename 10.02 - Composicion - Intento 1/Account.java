public class Account {
	private Customer customer;
	private int id;
	private String type;
	private String currency;
	private double annualInterestRate;
	private double minBalanceReq;
	private Date date;
	private double balance;

	public Account (Customer customer, int id, String type, String currency, double annualInterestRate, double minBalanceReq, Date date, double balance) {
		setCustomer(customer);
		setId(id);
		setCurrency(currency);
		setAnnualInterestRate(annualInterestRate);
		setMinBalanceReq(minBalanceReq);
		setDate(date);
		setBalance(balance);
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
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
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
}

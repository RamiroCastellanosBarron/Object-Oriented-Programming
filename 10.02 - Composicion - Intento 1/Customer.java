public class Customer {
	private Name name;
	private Date date;
	private Address address;
	private String phone;
	private String email;
	private String curp;

	public Customer (Name name, Date date, Address address, String phone, String email, String curp) {
		setName(name);
		setDate(date);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setCurp(curp);
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Name getName() {
		return name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getCurp() {
		return curp;
	}
	
}

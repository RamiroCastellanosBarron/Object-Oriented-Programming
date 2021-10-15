public class Customer {
	private Name name;//obj
	private DateOfBirth dateOfBirth;//obj
	private Address address;//obj
	private String phone;
	private String email;
	private String curp;

	public Customer(Name name, DateOfBirth dateOfBirth, Address address, String phone, String email, String curp) {
		setName(name);
		setDateOfBirth(dateOfBirth);
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
	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
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

	public String toString(){
		return "  >>  "+ "Telefono: " + getPhone() +"\n"+"  >>  "+ "Correo: " + getEmail()+"\n"+"  >>  "+ "Numero de identificacion: " + getCurp() +"\n";
	}
}

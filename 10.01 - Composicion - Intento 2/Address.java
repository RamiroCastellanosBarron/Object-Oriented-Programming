public class Address {
	private String street;
	private int addNumber;
	private String suburb;
	private String city;
	private int postalCode;

	public Address(String street, int addNumber, String suburb, String city, int postalCode) {
		setStreet(street);
		setAddNumber(addNumber);
		setSuburb(suburb);
		setCity(city);
		setPostalCode(postalCode);
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet() {
		return street;
	}
	public void setAddNumber(int addNumber) {
		this.addNumber = addNumber;
	}
	public int getAddNumber() {
		return addNumber;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getPostalCode() {
		return postalCode;
	}

	public String toString(){
		return getStreet() + " " + getAddNumber() + ", " + getPostalCode() + ", " + getSuburb() + ", " + getCity();
	}
}

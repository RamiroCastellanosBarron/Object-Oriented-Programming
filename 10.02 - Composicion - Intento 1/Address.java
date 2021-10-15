public class Address {
	private String street;
	private int addNum;
	private String suburb;
	private String city;
	private int postalCode;

	public Address (String street, int addNum, String suburb, String city, int postalCode) {
		setStreet(street);
		setAddNum(addNum);
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
	public int getAddNum() {
		return addNum;
	}
	public void setAddNum(int addNum) {
		this.addNum = addNum;
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
		return getStreet() + " " + getAddNum() + ", " + getSuburb() + ", " + getCity() + ", " + getPostalCode();
	}
}

public class Name {
	private String firstName;
	private String fatherLastName;
	private String motherLastName;

	public Name(String firstName, String fatherLastName, String motherLastName) {
		setFirstName(firstName);
		setFatherLastName(fatherLastName);
		setMotherLastName(motherLastName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}
	public String getFatherLastName() {
		return fatherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}
	public String getMotherLastName() {
		return motherLastName;
	}

	public String toString () {
		return getFirstName() + " " + getFatherLastName() + " " + getMotherLastName();
	}
}
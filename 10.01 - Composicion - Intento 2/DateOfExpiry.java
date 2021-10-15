public class DateOfExpiry {
	private int eDay;
	private int eMonth;
	private int eYear;

	public DateOfExpiry(int eDay, int eMonth, int eYear) {
		setEDay(eDay);
		setEMonth(eMonth);
		setEYear(eYear);
	}
	public void setEDay(int eDay) {
		this.eDay = eDay;
	}
	public int getEDay() {
		return eDay;
	}
	public void setEMonth(int eMonth) {
		this.eMonth = eMonth;
	}
	public int getEMonth() {
		return eMonth;
	}
	public void setEYear(int eYear) {
		this.eYear = eYear;
	}
	public int getEYear() {
		return eYear;
	}

	public String toString() {
		return getEDay() + "." + getEMonth() + "." + getEYear();
	}
}

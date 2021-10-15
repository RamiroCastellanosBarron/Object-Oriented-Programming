public class DateOfBirth {
	private int bDay;
	private int bMonth;
	private int bYear;

	public DateOfBirth (int bDay, int bMonth, int bYear) {
		setBDay(bDay);
		setBMonth(bMonth);
		setBYear(bYear);
	}
	public void setBDay(int bDay) {
		this.bDay = bDay;
	}
	public int getBDay() {
		return bDay;
	}
	public void setBMonth(int bMonth) {
		this.bMonth = bMonth;
	}
	public int getBMonth() {
		return bMonth;
	}
	public void setBYear(int bYear) {
		this.bYear = bYear;
	}
	public int getBYear() {
		return bYear;
	}
	public String toString(){
		return getBDay() + "." + getBMonth() + "." + getBYear();
	}
}
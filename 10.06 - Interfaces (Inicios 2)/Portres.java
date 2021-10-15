public class Portres implements Serie {
	int val;

	Portres() {
		val = 0;
	}

	public int getNext() {
		val +=3;
		return val;
	}
}

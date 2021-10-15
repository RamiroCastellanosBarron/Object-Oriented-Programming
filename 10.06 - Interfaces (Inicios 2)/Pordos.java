public class Pordos implements Serie {
	int val;

	Pordos() {
		val = 0;
	}

	public int getNext() {
		val +=2;
		return val;
	}
}

import java.util.*;
import java.text.*;

class Main {
	public static void main(String[] args){
		DecimalFormat w = new DecimalFormat("#,###.00");
		double importe = 1230.04;
		System.out.print(w.format(importe));
	}
}
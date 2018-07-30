package pass;
 
import java.lang.System;

public class Remainder {
	static public int remainder(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {
		int x = 13;
		int y = 7;
		System.out.println(x + " % " + y + " = " + remainder(x, y));
	}

}
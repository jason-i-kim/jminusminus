package pass;

import java.lang.System;

public class Decrement {
	static public int decrement(int x) {
		return (x--);
	}

	public static void main(String[] args) {
		int x = 7;
		int y = x--;
		System.out.println("x = " + x + "  x-- = " + decrement(x));
	}
}

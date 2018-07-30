package pass;

import java.lang.System;

public class BinLShift {
	static public int lshift(int x, int y) {
		return x << y;
	}

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		System.out.println(x + " << " + y + " = " + lshift(x, y));

	}

}

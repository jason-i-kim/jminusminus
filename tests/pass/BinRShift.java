package pass;

import java.lang.System;

public class BinRShift {
	static public int rshift(int x, int y) {
		return x >> y;
	}

	public static void main(String[] args) {
		int x = 234;
		int y = 3;
		System.out.println(x + " >> " + y + " = " + rshift(x, y));

	}

}

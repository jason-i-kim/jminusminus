package pass;

import java.lang.System;

public class LogRShift {
	static public int logrshift(int x, int y) {
		return x >>> y;
	}

	public static void main(String[] args) {
		int x = 23;
		int y = 1;
		System.out.println(x + " >>> " + y + " = " + logrshift(x, y));

	}

}

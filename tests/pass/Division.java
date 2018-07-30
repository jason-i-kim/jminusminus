package pass;

import java.lang.System;

public class Division {
	static public int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		System.out.println(x + " / " + y + " = " + divide(x, y));
	}

} 

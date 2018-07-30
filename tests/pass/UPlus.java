package pass;

import java.lang.System;

public class UPlus {
	public static int uplus(int i) {
		int INT = i;
		return +INT;
	}

	public static int uplus(char c) {
		char ch = c;
		return +ch;
	}

	// private static void method(byte i){
	// System.out.println("byte: " + i);
	// }
	//
	// private static void method(short c){
	// System.out.println("short: " + c);
	// }

	public static void main(String[] args) {
		// short sh = '8';
		// byte by = 4;

		char ch = 'A';
		System.out.println("The value of A is " + uplus(+ch));
		
		int i = 2;
		System.out.println("The value of i is " + uplus(+i));
	}
}
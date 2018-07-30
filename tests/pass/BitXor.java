package pass;

import java.lang.System;

public class BitXor{
	static public int bitxor(int x, int y) {
		return x ^ y;
	}
	
	public static void main(String[] args) {
        int x = 3;
        int y = 234;
        System.out.println(x + " ^ " + y + " = " + bitxor(x,y) );
	}
}
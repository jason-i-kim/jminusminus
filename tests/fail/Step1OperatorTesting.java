package pass;

import java.lang.System;

public class Step1OperatorTesting{
	static public boolean lt(int x, int y) {
		return (x<y);
	}
	
	public static void main(String[] args) {
        int x = 45;
        int y = 234;
        System.out.println(x + " < " + y + " = " + lt(x,y) );
	}
}
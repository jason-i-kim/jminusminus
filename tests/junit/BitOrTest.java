package junit;

import junit.framework.TestCase;
import pass.BitOr;

public class BitOrTest extends TestCase {
	private BitOr  BitOr;

	protected void setUp() throws Exception {
		super.setUp();
		  BitOr = new BitOr();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBitOr() {
		this.assertEquals(BitOr.bitor(3, 234), 235); 
		this.assertEquals(BitOr.bitor(67, 56), 123);
		this.assertEquals(BitOr.bitor(127, 128), 255);
	}
}
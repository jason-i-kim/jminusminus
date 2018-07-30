package junit;

import junit.framework.TestCase;
import pass.BitAnd;

public class BitAndTest extends TestCase {
	private BitAnd  BitAnd;

	protected void setUp() throws Exception {
		super.setUp();
		  BitAnd = new BitAnd();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBitAnd() {
		this.assertEquals(BitAnd.bitand(255, 1), 1); 
		this.assertEquals(BitAnd.bitand(255, 255), 255);
		this.assertEquals(BitAnd.bitand(127, 128), 0);
	}
}
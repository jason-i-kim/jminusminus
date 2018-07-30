package junit;

import junit.framework.TestCase;
import pass.BitXor;

public class BitXorTest extends TestCase {
	private BitXor  BitXor;

	protected void setUp() throws Exception {
		super.setUp();
		  BitXor = new BitXor();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBitXor() {
		this.assertEquals(BitXor.bitxor(127, 128), 255);
		this.assertEquals(BitXor.bitxor(255, 255), 0);
		this.assertEquals(BitXor.bitxor(46, 24), 54);
	}
}
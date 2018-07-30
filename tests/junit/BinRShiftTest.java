package junit;

import junit.framework.TestCase;
import pass.BinRShift;

public class BinRShiftTest extends TestCase {
	private BinRShift BinRShift;

	protected void setUp() throws Exception {
		super.setUp();
		BinRShift = new BinRShift();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBinRShift() {
		this.assertEquals(BinRShift.rshift(234, 3), 29);
		this.assertEquals(BinRShift.rshift(23, 1), 11);
		this.assertEquals(BinRShift.rshift(0, 1), 0);
	}
}
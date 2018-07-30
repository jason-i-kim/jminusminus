package junit;

import junit.framework.TestCase;
import pass.BinLShift;

public class BinLShiftTest extends TestCase {
	private BinLShift BinLShift;

	protected void setUp() throws Exception {
		super.setUp();
		BinLShift = new BinLShift();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBinLShift() {
		this.assertEquals(BinLShift.lshift(123, 2), 492);
		this.assertEquals(BinLShift.lshift(8, 1), 16);
		this.assertEquals(BinLShift.lshift(0, 7), 0);
	}
}
package junit;

import junit.framework.TestCase;
import pass.LogRShift;

public class LogRShiftTest extends TestCase {
	private LogRShift LogRShift;

	protected void setUp() throws Exception {
		super.setUp();
		LogRShift = new LogRShift();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@SuppressWarnings("static-access")
	public void testLogRShift() {
		this.assertEquals(LogRShift.logrshift(21, 2), 5);
		this.assertEquals(LogRShift.logrshift(1577, 3), 197);
		this.assertEquals(LogRShift.logrshift(0, 8), 0);
	}
}
package junit;

import junit.framework.TestCase;
import pass.UPlus;

public class UPlusTest extends TestCase {
	private UPlus UPlus;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
 
	public void testUPlus() {
		int i =2;
		char ch = 'A';
		this.assertEquals(UPlus.uplus(+i), 2);
		this.assertEquals(UPlus.uplus(+ch), 65);
	}
}
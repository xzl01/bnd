package test.simple;

import junit.framework.TestCase;

public class Test extends TestCase {

	public void testX() {
		Simple s = new Simple();
		String name = s.getName();
		System.out.println(name);
		assertEquals("WDYT?", name);
	}
}

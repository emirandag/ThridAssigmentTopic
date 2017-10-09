/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw26540084
 *
 */
public class MacBookAirTest {
	
	MacBookAir mac;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mac = new MacBookAir("Apple", "Air turbo", 100);

	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		mac = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thridassigmenttopic.DeviceImpl#overclock()}.
	 */
	@Test
	public final void testOverclock() throws Exception {
		assertEquals(150, mac.overclock());
		MacBookAir macClone = (MacBookAir) mac.clone();
		assertNotSame(mac, macClone);
		assertTrue(mac.getSpeed() == 100);
		assertSame(mac, mac);
	}

}

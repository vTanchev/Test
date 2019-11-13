package Zadaca23;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Zadaca2Test {
	
	int a;
	int b;
	String palindrom;
	String falsePalindrom;
	
	@Before
	public void setUp() throws Exception {
		a = 10;
		b = 8;
		palindrom = "ROTOR";
		falsePalindrom = "STATOR";
	}

	@Test
	public final void testZbir() {
		boolean val = (new Zadaca2().zbir(a));
		assertTrue(val);
	}
	
	@Test
	public final void testZbirFalse() {
		boolean val = (new Zadaca2().zbir(b));
		assertFalse(val);
	}
	
	@Test
	public final void testPalindromTrue() {
		boolean val = (new Zadaca2().palindrom(palindrom));
		assertTrue(val);
	}
	
	@Test
	public final void testPalindromFalse() {
		boolean val = (new Zadaca2().palindrom(falsePalindrom));
		assertFalse(val);
	}

}

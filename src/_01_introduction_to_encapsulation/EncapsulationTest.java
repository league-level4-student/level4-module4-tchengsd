package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncapsulationTest {
	EncapsulateTheData etd = new EncapsulateTheData();
	@Test
	public void testSetItems() {
		etd.setItemsReceived(3);
		assertEquals(3, etd.getItemsReceived());
		etd.setItemsReceived(-1);
		assertEquals(0, etd.getItemsReceived());
	}
	@Test
	public void testSetDegrees() {
		etd.setDegreesTurned((float) 156.3);
		assertEquals((float) 156.3, etd.getDegreesTurned());
		etd.setDegreesTurned((float) 373.8);
		assertEquals((float) 156.3, etd.getDegreesTurned());
	}
	@Test
	public void testSetNomenclature() {
		etd.setNomenclature("Test");
		assertEquals("Test", etd.getNomenclature());
		etd.setNomenclature("");
		assertEquals(" ", etd.getNomenclature());
	}
	@Test
	public void testSetMember() {
		etd.setMemberObj(13);
		assertEquals(13, etd.getMemberObj());
	}
}

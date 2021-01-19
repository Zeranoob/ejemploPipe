package ejemplopipeline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		assertEquals(2300000, new Diezxciento(23000000,900000).diezxciento());
		assertEquals(400000, new Diezxciento(400000,900000).diezxciento());

	}

	@Test
	public void testImpuesto() throws Exception {

		assertEquals(0,new Diezxciento(20000000,499999).impuesto());
		assertEquals(300000,new Diezxciento(20000000,500000).impuesto());
		assertEquals(2500000,new Diezxciento(50000000,1500000).impuesto());
		assertEquals(13000000,new Diezxciento(130000000,5000000).impuesto());
		assertEquals(120000000,new Diezxciento(800000000,20000000).impuesto());		
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento diezxciento = new Diezxciento(100000000,900000);
		assertEquals(90000000,diezxciento.saldoAhorro());
		assertNotEquals(1l,(long)diezxciento.saldoAhorro());
	}

}

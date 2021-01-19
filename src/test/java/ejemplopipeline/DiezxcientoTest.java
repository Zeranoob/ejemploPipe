package ejemplopipeline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(0,diezxciento.impuesto());
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento diezxciento = new Diezxciento(100000000,900000);
		assertEquals(90000000,diezxciento.saldoAhorro());
		assertNotEquals(1l,(long)diezxciento.saldoAhorro());
	}

}

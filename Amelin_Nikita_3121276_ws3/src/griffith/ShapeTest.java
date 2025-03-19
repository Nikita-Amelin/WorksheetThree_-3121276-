package griffith;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeTest {
	Circle c = new Circle(5);
	Rhombus r = new Rhombus(6, 8);
	RightAngledTriangle t = new RightAngledTriangle(6, 8);
	
	@Test
	public void perimeterTest() {
		assertEquals(31.4159, c.perimeter(), 0.0001);
		assertEquals(20, r.perimeter(), 0.0001);
		assertEquals(24, t.perimeter(), 0.0001);
	}
	
	@Test
	public void areaTest() {
		assertEquals(78.53975, c.area(), 0.0001);
		assertEquals(20, r.perimeter(), 0.0001);
		assertEquals(24, t.perimeter(), 0.0001);	
	}
	
	@Test
	public void toStringTest() {
		assertNotNull(c.toString());
		assertNotNull(r.toString());
		assertNotNull(t.toString());
	}
	
}

package griffith;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeTest {
	
	//Creating objects for tesing:
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
	
	@Test
	public void test() {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(10));
		shapes.add(new Circle(2));
		shapes.add(new Rhombus(2, 9));
		shapes.add(new Rhombus(4, 12));
		shapes.add(new RightAngledTriangle(5, 8));
		shapes.add(new RightAngledTriangle(2, 10));
		
		double[] areas = {314.159, 12.56636, 9, 24, 20, 10};
		double[] perimeters = {62.8318, 12.56636, 18.439088914585774, 25.298221281347036, 22.4339811320566, 22.19803902718557};

		for(int i=0; i<shapes.size(); i++) {
			assertEquals(areas[i], shapes.get(i).area(), 0.0001);
			assertEquals(perimeters[i], shapes.get(i).perimeter(), 0.0001);
		}
	}
	
}


























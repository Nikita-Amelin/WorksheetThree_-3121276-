//Nikita Amelin 3121276
package griffith;

public class Circle extends Shape {
	
	private double radius;
		
	public Circle(double radius) {
		super("Circle");
		this.radius=radius;
	}

	@Override
	public double area() {
		return PI*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*PI*radius;
	}
	
	@Override
    public String toString() {
        return this.getName()+", radius="+radius+", perimeter="+perimeter()+", area="+area();
    }
}

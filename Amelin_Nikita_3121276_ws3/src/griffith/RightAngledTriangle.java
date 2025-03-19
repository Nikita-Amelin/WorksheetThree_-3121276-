//Nikita Amelin 3121276
package griffith;

public class RightAngledTriangle extends Shape {

	private double a;	//side a
	private double b;	//side b
	private double c;	//side c (Hypotenuse)

	
	public RightAngledTriangle(double a, double b) {
		super("RightAngledTriangle");
		this.a=a;
		this.b=b;
		this.c= Math.sqrt(a*a+b*b);		
	}

	@Override
	public double area() {
		return a*b/2;
	}

	@Override
	public double perimeter() {
		return a+b+c;
	}
	
	@Override
    public String toString() {
        return this.getName()+", a="+a+", perimeter="+", b="+b+", c="+c+perimeter()+", area="+area();
    }
}

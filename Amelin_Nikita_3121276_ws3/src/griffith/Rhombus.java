package griffith;

public class Rhombus extends Shape {
	
	private double a;	//sides
	private double d1;	//diagonals
	private double d2;

	
	public Rhombus(double d1, double d2) {
		super("Rhombus");
		this.d1=d1;
		this.d2=d2;
		this.a=Math.sqrt(d2*d2+d1*d1)/2;
	}

	@Override
	public double area() {
		return d1*d2/2;
	}

	@Override
	public double perimeter() {
		return a*4;
	}
	
	@Override
    public String toString() {
        return this.getName()+", a="+a+", perimeter="+perimeter()+", area="+area();
    }
}

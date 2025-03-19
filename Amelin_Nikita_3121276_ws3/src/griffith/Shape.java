package griffith;

public abstract class Shape {
	
	private String name;
	
	public final double PI=3.14159;
	
	public Shape(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
    public String toString() {
        return this.name;
    }
	
	public abstract double area();
	public abstract double perimeter();

}

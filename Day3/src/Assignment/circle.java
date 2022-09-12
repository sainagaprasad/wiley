package Assignment;

public class circle {
	private double radius;
	private double area;

	public circle() {
		this.radius=5.0;
	}

	public circle(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = Math.PI*(radius*radius);
		System.out.printf("The area for radius %.2f is %.6f.\n", radius,area);
	}
}

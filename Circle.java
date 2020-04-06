package cylinder;

import java.util.Scanner;

public class Circle {
	protected double radius;

	public Circle(){}

	public Circle(double r) { setRadius(r); }

	public void setRadius(double r) {
		if(r < 0)
			this.radius = 0;
		else
			this.radius = r;
	}
	public double getRadius() { return this.radius; }
	
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter radius: ");
		setRadius(kb.nextDouble());
	}

	public double calculateArea(){ return Math.PI * Math.pow(radius, 2); }

	public double calCircumference() { return 2*radius* Math.PI; }

	public static void main(String[] args) {
		Circle kb = new Circle();
		kb.input();
		System.out.println(kb.calculateArea());
		System.out.println(kb.calCircumference());
	}

}

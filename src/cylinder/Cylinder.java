package cylinder;

import java.util.Scanner;

public class Cylinder extends Circle{
	private double high;

	public Cylinder() { super(); }
	public Cylinder(double r, double h) {
		super();
		setHigh(h);
	}
	
	public double getHigh() { return this.high; }
	public void setHigh(double h) {
		if (h < 0)
			h = 0;
		else
			this.high = h;
	}
	
	public void input() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Enter high: ");
		setHigh(nhap.nextDouble());
		super.input();
	}
	
	public double area() {
		double s = super.calculateArea() * 2 + 3.14 * 2 * radius * high;
		return s;
	}
	
	public static void main(String[] args) {
		Cylinder nhap = new Cylinder();
		nhap.input();
		System.out.println(nhap.area());
	}

}

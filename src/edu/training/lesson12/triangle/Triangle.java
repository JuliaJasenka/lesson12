package edu.training.lesson12.triangle;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	double ab;
	double bc;
	double ca;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;

		ab = distance(a, b);
		bc = distance(b, c);
		ca = distance(c, a);
	}

	private double distance(Point a, Point b) {
		double distance = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));

		return distance;
	}

	public double perimetr() {

		return round(ab + bc + ca);
	}

	public double square() {
		double p = perimetr() / 2;

		return round(Math.sqrt(p * (p - ab) * (p - bc) * (p - ca)));
	}

	public double round(double number) {
		return Math.round(number * 100) / 100.0;
	}

	public Point medianPoint() {

		double p1 = round((a.getX() + b.getX() + c.getX()) / 3);
		double p2 = round((a.getY() + b.getY() + c.getY()) / 3);

		return new Point(p1, p2);
	}
}
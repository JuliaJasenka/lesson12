package edu.training.lesson12.triangle;

import java.util.Objects;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		
	}
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String getPointStr() {
		return x + ", " + y; 
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}

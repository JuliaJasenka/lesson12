package edu.training.lesson12.triangle;

public class Main {
//7. Описать класс, представляющий треугольник. 
//Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle (new Point(0,0), new Point(0,10), new Point(10,0));
		
		System.out.println("The triangle's perimeter is "+triangle.perimetr());
		System.out.println("The triangle's area is " + triangle.square());
		System.out.println("Crossing point of the medians is (" + triangle.medianPoint().getPointStr() + ")");
		
		
		
	}
	
	
}

package edu.training.lesson12.counter;

public class Main {
	// Опишите класс, реализующий десятичный счетчик, который может увеличивать или
	// уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
	// инициализацию счетчика значениями по умолчанию и произвольными значениями.
	// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
	// получить его текущее состояние. Написать код, демонстрирующий все возможности
	// класса.

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		//Counter counter2 = new Counter(5);
		//Counter counter3 = new Counter (0,10);
		//Counter counter4 = new Counter (0,10,0);

		counter1.inc();
		counter1.inc();
		counter1.inc();
		counter1.dec();
		
		System.out.println(counter1.getCount());
		
		
}
}

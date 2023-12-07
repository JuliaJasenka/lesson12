package edu.training.lesson12.time;

public class Main {
	//6. Составьте описание класса для представления времени. 
	//Предусмотрте возможности установки времени и изменения его отдельных полей 
	//(час, минута, секунда) с проверкой допустимости вводимых значений. 
	//В случае недопустимых значений полей поле устанавливается в значение 0. 
	//Создать методы изменения времени на заданное количество часов, минут и секунд.

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); 

		
		time.setHour(47);
		time.setMinute(68);
		time.setSecond(32);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); 

		time.setTime(5, 55, 20);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); 

					
		time.addSecond(30);
		time.addMinute(20);
		time.addHour(7);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); 

	}

}

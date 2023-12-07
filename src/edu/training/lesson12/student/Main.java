package edu.training.lesson12.student;

public class Main {
	// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
	// номер группы, успеваемость (массив из пяти элементов).
	// Создайте массив из десяти элементов такого типа.
	// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
	// оценки, равные только 9 или 10.

	public static void main(String[] args) {

		int n = 7;
		Student[] students = new Student[n];

		students[0] = new Student("Петров", "П.П.", 1, new int[] { 8, 9, 8, 9, 8 });
		students[1] = new Student("Иванов", "И.И.", 2, new int[] { 10, 9, 10, 9, 10 });
		students[2] = new Student("Сидоров", "С.С.", 1, new int[] { 8, 9, 8, 9, 8 });
		students[3] = new Student("Курочкин", "К.К.", 1, new int[] { 8, 9, 8, 9, 8 });
		students[4] = new Student("Белкин", "Б.Б.", 1, new int[] { 8, 9, 8, 9, 8 });
		students[5] = new Student("Зайцев", "В.В.", 1, new int[] { 9, 9, 10, 9, 9 });
		students[6] = new Student("Конюхов", "К.к.", 1, new int[] { 8, 9, 8, 9, 8 });

		printHightScore(students);
	}

	private static void printHightScore(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student.isHighMarks()) {
				System.out.println("Surname: " + student.getSurname() + ", group number: " + student.getGroupNumber()
						+ ", student marks: " + student.getMarksStr());
			}
		}

	}

}

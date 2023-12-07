package edu.training.lesson12.student;

public class Student {
	private String surname;
	private String initials;
	private int groupNumber;
	private int[] marks;

	public Student(String surname, String initials, int groupNumber, int[] marks) {
		if (marks.length != 5) {
			throw new RuntimeException("");// текст
		}
		this.surname = surname;
		this.initials = initials;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getSurname() {
		return surname;
	}

	public String getInitials() {
		return initials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public String getMarksStr() {
		String a = "";
		for (int i = 0; i < marks.length; i++) {
			a = a + marks[i] + " ";
		}
		return a;
	}

	public boolean isHighMarks() {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 9) {
				return false;
			}
		}
		return true;
	}
}

package edu.training.lesson12.time;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(12, 30, 45);
	}

	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public void setSecond(int second) {
		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void addSecond(int second) {
		this.second = this.second + second;
				
		this.minute = this.minute + this.second / 60;
		this.second = this.second % 60;

		this.hour = this.hour + this.minute / 60;
		this.minute = this.minute % 60;
		
		this.hour = this.hour % 24;

	}

	public void addMinute(int minute) {
		addSecond(minute * 60);
	}

	public void addHour(int hour) {
		addSecond(hour *60* 60);
	}

}

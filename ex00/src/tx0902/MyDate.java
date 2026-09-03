package tx0902;

import java.time.LocalDate;

public class MyDate {

	private int day;
	private int hour;
	private int year;

	// 담아야하는 변수
	int days;
	int years;
	int hours;
	
	public MyDate(int day, int hour, int year) {
		this.year = year;
		this.hour = hour;
		this.day = day;
	}

	
	/*
	 * 년표시 
	 */
	public void year() {
		if(year%4 ==0 || year% 4!=1 ) {
			year++;
		}else if(year%7 ==0) {
			years = year-1;
		}
	}

	/*
	 * 월 1~31
	 */
	public void day() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		//4 = ....1?
		if(day%4 == 1) { 
			System.out.println("(오늘 일" + day + "맞아?");
		}else if(day %4 == 0) {
			//days =day;
		}else {
			System.out.println(days);
		}
	}
	//윤년 

	/*
	 * 시간 0~60
	 */
	public void hour() {
		if(hour%6 ==4) {
			hours = hour;
		}else if(hour%6 ==0) {
			hours = hour -4;
		}else {
			System.out.println(hours);
		}
	}
}

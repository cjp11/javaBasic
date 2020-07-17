package ex01;

import java.text.DateFormat;
import java.util.Calendar;

public class exam01_4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 1) 기본 출력 형식 -> 현재 OS에 설정된 국가, 언어, 날짜 형식을 따른다.
		DateFormat df = DateFormat.getDateInstance();
		String str = df.format(cal.getTime());
		System.out.println(str);
		
		// 2) 다른 출력 형식
		df = DateFormat.getDateInstance(DateFormat.FULL);
		str = df.format(cal.getTime());
		System.out.println(str);
	}

}

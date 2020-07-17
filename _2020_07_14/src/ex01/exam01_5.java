package ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *  ���� DateFormat ũ������ ��� ������ �����Ǿ� �ְ�, �� ���� �ȵȴ�.
 *  �׷��� �ڹٴ� ����� �Ը��� �°� ��� ������ ������ �� �ֵ���
 *  DateFormat Ŭ������ ����� ������ SimpleDateFormat Ŭ������ �����Ѵ�. 
 */
public class exam01_5 {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
		
		//Date->String
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = df.format(cal.getTime());
		System.out.println(str);
		System.out.println(cal.getTime());
		
		//String->Date
		Date date = df.parse("2020-07-14 10:54:57");
		System.out.println(date);
		
	}

}

package ex01;

import java.util.Calendar;

public class exam01_3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DAY_OF_MONTH),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));
		cal.add(Calendar.DAY_OF_MONTH,-6);
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DAY_OF_MONTH),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));

	}

}

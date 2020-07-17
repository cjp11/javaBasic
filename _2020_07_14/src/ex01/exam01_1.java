package ex01;

import java.util.Calendar;

public class exam01_1 {

	public static void main(String[] args) {
		/*Calendar cal = new Calendar();*/	//Calendar의 생성자가 protected로 선언되어 있어(클래스 내부에서만 접근가능) 
											// 클래스 밖에서 호출하므로 접근 불가
											// Calendar의 서브 클래스나 같은 패키지 소속 클래스가 아니면 , 접근(호출,실행) 제한
		Calendar cal = Calendar.getInstance();	
		// Calendar는 왜 생성자 호출을 제한했는가?
		// -> 생성자를 호출할 수 없으면 "달력" 객체를 만들 수 없다. 
		// -> 이유?
		//	- 달력 객체를 생성하는 코드가 복잡하기 때문에
		//	- 즉, 개발자가 직접 달력을 생성하려면 System.currentTimeMillis()를 통해
		//	   현재 시간 정보를 얻어야하고, 그 얻은 시간을 가지고 달력 객체를 생성해야 하는데,
		//	   그런 번거로움을 없애기 위해 별도로 스태틱 매서드를 제공해 준다.
		Calendar cal2 = Calendar.getInstance();  // Calendar는 하나여야 하지만 cal2, cal3 값이 다른 이유는
		for(int i=0,j=0; i<900_000_000;i++) {
			j++;
		}
		Calendar cal3 = Calendar.getInstance();	// 내부에서 currenTimeMillis 값이 다르기 때문.(각각은 시작 값이 다름)
		if(cal2 == cal3) {
			System.out.println("cal2==cal3");
		}
		System.out.println(cal);
		System.out.println(cal2);
	}

}

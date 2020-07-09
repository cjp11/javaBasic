package ex04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		// 레퍼런스 변수 선언은 클래스를 로딩할 필요가 없다.
		// 실행하기 전에 User.class
		//User user;				// 레퍼런스 변수를 선언할 때 클래스가 로딩되지 않는다.
		
		//1) 스태틱 변수를 사용할 때 클래스가 자동 로딩된다. 
		//User.count = 100;
		
		//2) 스태틱 매서드를 호출할 때 클래스가 자동 로딩된다.
		//User.increaseCount();
		
		//3) 인스턴스를 생성할 때
		//user = new User();
		
		Student st = new Student();
		
		/*4) 클래스를 로딩시키는 전문 도구를 사용할 때 (나중에 배움; 예외처리)
		Class c = Class.forName("ex04.User");	//method 영역에 로드만 함
		user = (User)c.newInstance();			//heap에 잡아서 메모리 주소를 넘겨줌. 
		user.count = 1;
		user.name = "윤윤윤";
		System.out.println(user.count);
		System.out.println(user.name);
		user.count++;
		System.out.println(user.count);
		*/
		
		
		 
	}

}

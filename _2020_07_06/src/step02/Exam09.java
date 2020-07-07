package step02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner keyScanner = new java.util.Scanner(System.in);
		System.out.print("이름? ");
		String name = keyScanner.nextLine(); 
		
		System.out.print("나이? ");
		int age = Integer.parseInt(keyScanner.nextLine());
		System.out.printf("%s(%d)\n",name,age);
	}
}
/*
 * # 패키지 클래스 사용법
 * -다른 패키지에 소속된 클래스를 사용할 때는 
 *  반드시 패키지명을 지정해야 한다.
 * -예외!
 *  java.lang 패키지의 클래스를 사용할때는 지정하지 않아도 된다.
 *  자바 컴파일러가 자동으로 찾는다.
 * -주의!
 *  java.lang 패키지를 생략한다고 해서 그 하위 패키지까지 허용되는 것은 아니다.
 *  java.lang.relect, java.lang.annoation 등 그 하위 패키지의 클래스를 사용할 때는
 *  무조건 패키지 이름을 적어야 한다.
 *
*/

/*
 * # import 사용법
 * 1) 클래스의 피키지 정보를 정확하게 지정
 *  => import java.util.Scanner;
 * 2) 클래스가 소속된 패키지 정보를 지정
 *  => import java.util.*;
 *  => 장점: java.util의 모든 클래스를 자유롭게 사용할 수 있다.
 *  => 단점: 유지보수할 때 코드에서 사용한 클래스가 정확하게 어떤 패키지에 있는지
 *        알기 어렵다. => 실무에서는 가능한 1)번 방식을 사용한다.
 *  자주 오해하는 개념!
 *  =>import 문장이 많으면 .class 파일의 크기가 커진다고 착각한다.
 *  =>import는 컴파일할 때 컴파일러에게 전달하는 정보이기 때문에 컴파일 한 후에는 
 *    import 문을 제거한다.
 *  =>개발자 중에는 import 문의 줄 수를 줄이기 위해 wildcard(*)를 사용하는 경우가 있다.=>
 *   .class 파일의 크기하고 상관없다. 
 */


















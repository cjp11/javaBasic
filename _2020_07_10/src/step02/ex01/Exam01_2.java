package step02.ex01;

/*
 * Object 클래스 - toString(), hashCode(), equals(), getClass()
 * ->toString(): '인스턴스'의 정보 리턴
 * - 기본: 클래스@인스턴스식별번호(hashcode)
 * - 인스턴스의 간략 정보를 리턴할 때 사용한다.
 * - 기본으로 출력하는 내용은 사용하는데 무의미 할 수 있다.
 * - 맘에 안들면 재정의해서 사용한다.
 * 
 * ->hashCode(): '인스턴스'의 식별 코드 리턴
 * - 인스턴스를 맵에 저장할 때 태그로 사용한다.
 * - 인스턴스끼리 값을 비교할 때 사용한다.
 * 
 * ->equals(): 두 '인스턴스'의 비교 결과를 리턴
 * - 기본: 같은 인스턴스이면 True, 아니면 false
 * 
 * ->getClass(): '인스턴스'가 어떤 클래스인지 그 정보를 리턴한다.
 * 
 * ->finalize(): 가비지 컬렉터가 인스턴스를 메모리에서 해제하기 전에 호출하는 메서드.
 * 				 이 매서드에서는 보통 인스턴스가 사용했던 자원을 해제시키는 작업을 한다.
 * 				 그러나 가비지 컬렉터가 언제 호출될 지 알 수 없고,
 * 				 프로그램이 종료될 때까지 메모리가 부족하지 않다면 가비지 컬렉터가 실행되지 
 * 				 않기 때문에, 프로그램이 종료될 때까지 finalize()는 호출되지 않을 수도 있다.
 * 				 따라서, 실무에서 인스턴스가 사용한 자원을 해제시키기 위한 방법으로는 
 *  			finalize() 매서드 재정의를 사용하지 않는 것이 좋다. 
 */


public class Exam01_2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		A r1 = new A();		// new A:  A 주소값 가지고 오고 메모리에 클래스를 로드하는 작업 + () 호출하는 부분
		A r2 = new A();
		//Object 
		System.out.printf("r1.toString(): %s\n", r1.toString());
		System.out.printf("r1.hashCode(): %s\n", Integer.toHexString(r1.hashCode()));
		System.out.printf("r2.toString(): %s\n", r2.toString());
		System.out.printf("r2.hashCode(): %s\n", Integer.toHexString(r2.hashCode()));
		//r1.toString(): step02.ex01.A@15db9742
		// 15~~ 는 해시코드
		// 실제로 주소를 내부에서 변환시켜 다른 형태로 저장함.
		// r1 에 100번지가 저장되는것이아닌
		// hashcode(100) -> output은 다른 값으로 변환되어 리턴되는데 그 값으로 주소를 찾아감.
		// 이 과정은 실제로 해당 주소에 접근할 때 빠르게 접근하게 하기 위한 처리인듯 싶음. 
		
		if(r1 == r2) {
			System.out.println("r1==r2");
		}
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		
		Class c1 = r1.getClass();	//r1의 주소를 가져옴
		Class c2 = r2.getClass();
		System.out.println(c1);
		System.out.println(c2);
		if(c1 == c2) {
			System.out.println("c1==c2");
		}
		/*
		Object p =r1.getClass();	// 참조만 가능하게 함. read only. 한번 올려놓음. 아래처럼 cast 하면 에러남. 
		A pp = (A)p;
		pp.var1 = 300;
		System.out.println(pp.var1);
		*/
		System.out.println(c1.getName());
		// 설계도만 있다면 인스턴스를 생성할 수 있다.
		A r3 = (A)c1.newInstance();
	}

}

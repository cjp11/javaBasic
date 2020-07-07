package step01;

public class Exam02 {
	static int a = 10;  // 클래스 변수(필드, 속성) = 스태틱 변수
	int b = 30; // 인스턴스 변수(필드,속성)
	public static void main(String[] args/*로컬 변수, 파라미터 */) {
		int c = 20; //로컬 변수
		Exam02 ref; //로컬 변수
		ref = new Exam02(); // 인스턴스 생성
	}
}
/* JVM이 관리하는 메모리 영역
 *1) Method Area
 * =>. class 파일 코드가 보관된다.
 * => 스태틱 변수와 상수 값이 보관된다.
 *2) Stack per Thread
 * => 메서드를 호출할 때 마다 그 메서드가 사용할 전용 메모리가 준비된다.
 *   "프레임(frame)"이라 부른다.
 * => 로컬 변수가 보관된다.
 * => 메서드 호출이 끝나면 해당 프레임이 제거된다 => 로컬 변수 삭제된다. 
 *3) Heap
 * => new, Class.newInstance() 등의 명령을 통해 생성한 인스턴스를 보관한다.
 * 
 * # 변수의 종류와 메모리 영역, 생성주기
 * 1) 로컬 변수
 *  => JVM Stack 영역에 존재한다.
 *  => 메서드가 호출될때 생성되고, 호출이 완료되면 삭제된다.
 * 2) 스태틱 변수
 *  => Method Area 영역에 존재한다.
 *  => 클래스가 로딩될 때 생성된다. JVM이 종료될 때 삭제된다.
 * 3) 인스턴스 변수
 *  =>Heap 영역에 존재한다.
 *  =>인스턴스를 생성할 때 준비된다.
 *  =>인스턴스를 가리키는 레퍼런스가 없으면 가비지로 취급된다.
 *    가비지 컬렉터에 의해 수집될때 삭제된다. 
*/



















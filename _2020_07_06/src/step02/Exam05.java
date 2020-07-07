package step02;

public class Exam05 {

	public static void main(String[] args) {
		Board3 b1 = new Board3(); //<== Board3의 기본 생성자 호출
		//기본 생성자가 초기화시킨 인스턴스 변수는 나두고,
		//나머지 변수의 변수값을 초기화 시키자.
		b1.contents  ="내용입니다.";
		b1.writer  ="홍길동";
		
		//b1 객체의 인스턴스 변수 값을 출력하자
		// => b1 레퍼런스가 가리키는 객체
		// => b1 레퍼런스가 가리키는 인스턴스
		// => b1 레퍼런스 변수에 저장된 주소의 인스턴스 
		System.out.println(b1.no);  //생성자에서 초기화시킴.
		System.out.println(b1.title); //생성자에서 초기화시킴.
		System.out.println(b1.contents);
		System.out.println(b1.writer);
		System.out.println(b1.createDate); //생성자에서 초기화시킴.
		System.out.println(b1.viewCount);  //생성자에서 초기화시킴.
		System.out.println(b1.passwd);  //생성자에서 초기화시킴.
		b1.set(5);
		System.out.println(b1.no); 
	}

}

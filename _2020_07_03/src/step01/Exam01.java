package step01;
// 새 데이터 타입 정의하기(class)
public class Exam01 {
	// 1) 새 데이터 타입 정의
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		
	}
	public static void main(String[] args) {
		// 2) Student 메모리의 주소를 저장할 변수 선언 (레퍼런스라부름)
		Student s1;	// C++은 스택에 잡히고 직접 접근해줌. Java는 스택에 잡히고 new로 힙에 할당해서 사용함. 
		// 3) Student 타입의 메모리를 준비한다. (인스턴스라부름)
		// s1.no = 1; -> 메모리 할당받지 않았으므로 에러(initialize 되지 않았으므로)
		s1 = new Student();
		
		// 4) 메모리에 값을 저장한다.
		s1.no = 1;
		s1.kor = 95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		
		// 5) 총점과 평균을 출력한다. 
		float sum = s1.kor + s1.eng + s1.math;
		float avg = sum / 3;
		System.out.printf("총점: %f\n", sum);
		System.out.printf("평균: %f\n", avg);
	}

}
